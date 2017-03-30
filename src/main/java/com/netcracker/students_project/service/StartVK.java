package com.netcracker.students_project.service;


import com.netcracker.students_project.dao.Factory;
import com.netcracker.students_project.entity.User;
import com.netcracker.students_project.entity.exception.ExceptionDao;
import com.vk.api.sdk.client.Lang;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.queries.users.UserField;
import com.vk.api.sdk.queries.users.UsersGetQuery;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public class StartVK {
    public User startVkApi(String code){
        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);
        UserAuthResponse authResponse = null;
        System.out.println("\n"+code+"\n");
        try {
            authResponse = vk.oauth()
                    .userAuthorizationCodeFlow(5950277, "hzFYcQ1s5iYXogqTmzWz", "http://localhost:8080/goHome", code)
                    .execute();
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        assert authResponse != null;
        UserActor actor = new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
        List<UserXtrCounters> users=null;
        try {
            users  = vk.users().get()
                    .userIds(actor.getId().toString())
                    .fields(UserField.VERIFIED, UserField.SEX)
                    .lang(Lang.EN)
                    .execute();
        } catch (ApiException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        UsersGetQuery usersGetQuery = vk.users().get(actor);
        User user=new User( users.get(0).getFirstName()+" "+ users.get(0).getLastName(), users.get(0).getId(), actor.getAccessToken());
        try {
           user = Factory.getInstance().getUserDao().create(user);
        } catch (ExceptionDao exceptionDao) {
            exceptionDao.printStackTrace();
        }
//        JSONParser parser = new JSONParser();
//        Object obj = parser.parse(vk.users().get(actor));
//        JSONObject jsonObj = (JSONObject) obj;
//        System.out.println(jsonObj.get("paramsStr"));
        return user;
    }

}
