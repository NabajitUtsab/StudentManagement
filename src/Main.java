import java.util.Scanner;

public class Main {
   public static Scanner scanner=new Scanner(System.in);


    static String Username;
    static String Userpass;

    public static void loginMethod(){
        System.out.println("Enter your name");
        Username=scanner.nextLine();

        System.out.println("Enter your pass");
        Userpass=scanner.nextLine();

        new Login(Username,Userpass);
    }


    public static void main(String[] args) {



        System.out.println("Are you students? (Y/N)");
        String answer=scanner.nextLine();

        if(answer.equalsIgnoreCase("Y")){
            System.out.println("Welcome to F Student Management");

            System.out.println("SignUp or Login");
            System.out.println("Type S for SignUp and L for Login");

            String answer2=scanner.nextLine();

            if(answer2.equalsIgnoreCase("S")){
                System.out.println("Enter your name");
                String name=scanner.nextLine();

                System.out.println("Enter your pass");
                String pass=scanner.nextLine();

                System.out.println("Enter your age");
                int age=scanner.nextInt();

                System.out.println("Enter your class");
                int class1=scanner.nextInt();

                System.out.println("Enter your roll");
                int roll=scanner.nextInt();

                new StudentSignup(name,pass,age,class1,roll);
                System.out.println("SignUp Successful");
                System.out.println("Want to Login?Y/N");

                String answer3=scanner.nextLine();
                if(answer3.equalsIgnoreCase("Y")){
                    loginMethod();
                }
                else{
                    System.exit(0);
                }




            }
            else{
               loginMethod();
            }


        }


        //else
    }
}