import java.util.ArrayList;
import java.util.Scanner;

public class BasicLoopExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the max. value :");
        int maxValue = sc.nextInt();

        for(int i = 1 ; i <= maxValue ; i *=4) {
            System.out.print(i + " ");
            
        }System.out.println("\n");
        for(int i = 1 ; i <= maxValue ; i *=5) {
            System.out.print(i + " ");
        }
    }
}
