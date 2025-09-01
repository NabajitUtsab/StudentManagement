import java.sql.SQLException;

public class StudentSignup {

    StudentSignup(String name,String pass,int age,int className,int roll){
        String query="insert into student values ('"+name+"','"+pass+"','"+age+"','"+className+"','"+roll+"')";

        try{
            Database db=new Database();
            db.statement.executeUpdate(query);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
