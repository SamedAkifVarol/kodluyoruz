import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int select;
        String username,password;
       
        System.out.print("Username :");
        username = sc.nextLine();

        System.out.print("Password :");
        password = sc.nextLine();

        if(username.equals("patika") && password.equals("123")) {
            System.out.println("welcome");
        }
        else   System.out.println("Not Valid");
    }
}
