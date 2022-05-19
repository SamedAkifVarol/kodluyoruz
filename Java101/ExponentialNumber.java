import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int number = sc.nextInt();

        System.out.print("Enter your exponential : ");
        int expo = sc.nextInt();

        int total = 1;
        
        for(int i = 1 ; i <= expo ; i++) {
            total *= number;
        }
        System.out.println("Total : " + total);
    }
}
