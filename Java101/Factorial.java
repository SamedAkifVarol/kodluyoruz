import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value :");
        int maxValue = sc.nextInt();

        System.out.print("Enter the number of subsets : ");
        int subsets = sc.nextInt();

        int total = 1;
        int subsetTotal = 1;
        int diffrenceTotal = 1;

        for(int i = 1 ; i <= maxValue ; i++) {
            total *= i;
        }
        for(int i = 1 ; i <= subsets ; i++) {
            subsetTotal *= i;
        }
        for(int i = 1 ; i <= maxValue - subsets ; i++) {
            diffrenceTotal *= i;
        }
        System.out.println("Combination : " + total/(subsets * diffrenceTotal));
    }
}
