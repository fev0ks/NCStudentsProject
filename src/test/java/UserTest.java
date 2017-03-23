import com.netcracker.students_project.dao.Factory;
import com.netcracker.students_project.entity.UserEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.sql.Date;



public class UserTest {
    Factory factory = Factory.getInstance();
    @Test
    public void createUser(){
        UserEntity userEntity =  new UserEntity();
        userEntity.setId(1);
        userEntity.setEmail("test@gmail.com");
        userEntity.setNickname("testUser");
        userEntity.setDtRegistration(new Date(1111,11,11));
        userEntity.setVkId(1);
        userEntity.setVkToken("1");
        assertTrue(factory.getUserDao().create(userEntity));
    }


}

