import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class GetVillainsNames {

    public static void main(String[] args) throws SQLException {

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123456");

        Connection connection =
                DriverManager.getConnection("//localhost:3306/minions_db/");


    }
}
