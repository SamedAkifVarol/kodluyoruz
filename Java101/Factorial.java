import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value :");
        int maxValue = sc.nextInt();

        int total = 1;

        for(int i = 1 ; i <= maxValue ; i++) {
            total *= i;
        }
        System.out.println(maxValue + " Factorial : " + total);
    }
}
