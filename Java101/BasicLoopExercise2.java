import java.util.Scanner;

public class BasicLoopExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true) {
            System.out.println("Enter the number : ");
            int number = sc.nextInt();

            if(number >= 0 && number % 2 != 0) total += number; 
            
            else if (number < 0) {
                System.out.println("Total : " + total);
                break;
            }
        }
        
    }
}
