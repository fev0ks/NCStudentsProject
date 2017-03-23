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
  private  UserEntity userOwner;
    private TaskEntity taskEntity;
    private TegEntity tegEntity;
    private UserEntity userMentor;
    private RoleEntity roleOwner;
    private RoleEntity roleMentor;

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

    @Test
    public void createTask(){
        taskEntity = new TaskEntity();
        taskEntity.setId(1);
        taskEntity.setDtCreated(new Date(Calendar.getInstance().getTimeInMillis()));
        taskEntity.setDescription("Hello Test CreateTask");
        taskEntity.setName("test name task");
        assertTrue(new Factory().getInstance().getTaskDao().create(taskEntity));
    }

    @Test
    public void createRoleOwner(){
        roleOwner = new RoleEntity();
        roleOwner.setId(1);
        roleOwner.setName("owner");
        assertTrue(new Factory().getInstance().getRoleDao().create(roleOwner));
    }

    @Test
    public void createAssignmentFirst(){
        AssignmentEntity assignmentEntityFirst=new AssignmentEntity();
        assignmentEntityFirst.setUserId(userOwner.getId());
        assignmentEntityFirst.setTaskId(taskEntity.getId());
        assignmentEntityFirst.setRoleEntity(roleOwner);
        assignmentEntityFirst.setEmailNotification(true);
        assertTrue(new Factory().getInstance().getRoleDao().create(assignmentEntityFirst));
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
        userMentor  =  new UserEntity();
        userMentor.setId(2);
        userMentor.setEmail("mentor@gmail.com");
        userMentor.setNickname("testMentor");
        userMentor.setDtRegistration(new java.sql.Date(Calendar.getInstance().getTimeInMillis()));
        userMentor.setVkId(2);
        userMentor.setVkToken("2");
        assertTrue(new Factory().getInstance().getUserDao().create(userOwner));
    }
    @Test
    public void createRoleMentor(){
        roleMentor = new RoleEntity();
        roleMentor.setId(2);
        roleMentor.setName("mentor");
        assertTrue(new Factory().getInstance().getRoleDao().create(roleMentor));
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

    @Test void createSubbmission(){
        SubmissionEntity submissionEntity = new SubmissionEntity();
        submissionEntity.setId(1);
        submissionEntity.setResult(true);
        submissionEntity.setUserEntity(userMentor);
        submissionEntity.setStepkEntity(new StepEntity());
        assertTrue(new Factory().getInstance().getRoleDao().create(submissionEntity));
    }
}

