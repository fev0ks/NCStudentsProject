import com.netcracker.students_project.dataBase.ConnectorDB;
import org.junit.jupiter.api.Test;


public class ConnectorTest {
    @Test
    public void getConnectorInstance(){
        ConnectorDB connectorDB=new ConnectorDB();
//        String insertQuery = "insert into test_tb values(?,?);";
//        try (PreparedStatement preparedStatement = connectorDB.getConnection().prepareStatement(insertQuery)) {
//           // preparedStatement.setInt(3, 2);
//            preparedStatement.setString(1, "test");
//            preparedStatement.setInt(2, 21);
//
//            preparedStatement.execute();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
