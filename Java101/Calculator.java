import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n1,n2,select;

        String str = "-----------------------\n"
        + "1)addition\n"
        + "2)extraction\n"
        + "3)division\n"
        + "4)multiplication\n"
        + "-----------------------\n"
        + "Select your process :";
        System.out.println(str);
        select = sc.nextInt();

        switch (select) {
            case 1:
            System.out.print("Enter the first Number : ");
            n1 = sc.nextInt();
            System.out.print("Enter the second Number :");
            n2 = sc.nextInt();
            System.out.print("Total = " + (n1 + n2));
            break;

            case 2:
            System.out.print("Enter the first Number : ");
            n1 = sc.nextInt();
            System.out.print("Enter the second Number :");
            n2 = sc.nextInt();
            System.out.print("Total = " + (n1 - n2));
            break;

            case 3:
            System.out.print("Enter the first Number : ");
            n1 = sc.nextInt();
            System.out.print("Enter the second Number :");
            n2 = sc.nextInt();
            System.out.print("Total = " + (n1 / n2));
            break;

            case 4:
            System.out.print("Enter the first Number : ");
            n1 = sc.nextInt();
            System.out.print("Enter the second Number :");
            n2 = sc.nextInt();
            System.out.print("Total = " + (n1 * n2));
            break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}
