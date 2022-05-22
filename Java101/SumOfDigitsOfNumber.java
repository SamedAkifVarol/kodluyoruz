import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your number : ");
        int input = sc.nextInt();
        int number = 0;

        while (input > 0) {
            number += input % 10;
            input = input / 10;
        }
        System.out.print("Total : " + number);
    }
}
