import com.netcracker.students_project.dao.Factory;
import com.netcracker.students_project.entity.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//вообще по идее это надо запихать в один метод под общую транзакцию
public class CreateDaoTest {
    UserEntity userOwner;
    TaskEntity taskEntity;
    TegEntity tegEntity;
    UserEntity userMentor;
    RoleEntity roleOwner;
    RoleEntity roleMentor;

    @Test
    public void createUserOwner(){
        userOwner  =  new UserEntity();
        userOwner.setId(1);
        userOwner.setEmail("test@gmail.com");
        userOwner.setNickname("testUser");
        userOwner.setDtRegistration(new Date(1111,11,11));
        userOwner.setVkId(1);
        userOwner.setVkToken("1");
        assertTrue(new Factory().getInstance().getUserDao().create(userOwner));
    }
    public void createTask(){

    }
    @Test
    public void createSteps() {
        StepEntity stepEntity = new StepEntity();
        int i;
        for (i = 0; i < 3; i++) {
            stepEntity.setName("step test" + i);
            stepEntity.setDescription("hello step");
            File file = new File("resources/JustDoIT.jpg");
            try {
                stepEntity.setProofPhoto(Files.readAllBytes(file.toPath()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            long timeInMillis = Calendar.getInstance().getTimeInMillis();
            long randomLong=Math.round((1+Math.random())*259200000*5);
            stepEntity.setDtStarted(new Date(Calendar.getInstance().getTimeInMillis()));
            stepEntity.setDeadline(new Date(timeInMillis ));
            stepEntity.setDtFinished(new Date(timeInMillis + randomLong/2));
            stepEntity.setTaskEntity(taskEntity);

        }
        assertEquals(i,2);
    }
    @Test
    public void createTeg(){
        tegEntity =new TegEntity();
        tegEntity.setText("testTeg");
        assertTrue(new Factory().getInstance().getTegDao().create(tegEntity));
    }
    @Test
    public void createTaskTeg(){
        TaskTegEntity taskTegEntity=new TaskTegEntity();
        taskTegEntity.setTaskEntity(taskEntity);
        taskTegEntity.setTegEntity(tegEntity);
        assertTrue(new Factory().getInstance().getTaskTegsDao().create(taskTegEntity));
    }
    @Test
    public void createUserMentor(){
        userOwner  =  new UserEntity();
        userOwner.setId(2);
        userOwner.setEmail("mentor@gmail.com");
        userOwner.setNickname("testMentor");
        userOwner.setDtRegistration(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        userOwner.setVkId(2);
        userOwner.setVkToken("2");
        assertTrue(new Factory().getInstance().getUserDao().create(userOwner));
    }
    @Test
    public void createAssignment(){
        AssignmentEntity assignmentEntity=new AssignmentEntity();
        assignmentEntity.setUserId(userMentor.getId());
        assignmentEntity.setTaskId(taskEntity.getId());
        assignmentEntity.setRoleEntity(roleMentor);
        assignmentEntity.setEmailNotification(true);
        assertTrue(new Factory().getInstance().getRoleDao().create(assignmentEntity));
    }

}

