import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    Connection connection;
    Statement statement;

    Database(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","nabajit9");
            statement= connection.createStatement();


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


}
