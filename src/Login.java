import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    String name,pass;

    Login(String name,String pass){
        this.name=name;
        this.pass=pass;

        String query="Select * from student where name='"+name+"' AND pass='"+pass+"'";

        try{
            Database db=new Database();
            ResultSet resultSet=db.statement.executeQuery(query);

            if (resultSet.next()){
                System.out.println("Login Success");
            }
            else{
                System.out.println("User not found");
            }


        }catch (Exception e){


            System.out.println(e.getMessage());
        }

    }
}
