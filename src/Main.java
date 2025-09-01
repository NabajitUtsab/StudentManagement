import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

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

                System.exit(0);


            }
            else{
                System.out.println("Enter your name");
                String name=scanner.nextLine();

                System.out.println("Enter your pass");
                String pass=scanner.nextLine();
            }


        }
    }
}