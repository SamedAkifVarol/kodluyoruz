import java.util.Scanner;

public class BasicLoopExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your max value : ");
        int maxValue = sc.nextInt();
        int total = 0;

        for(int i = 1 ; i <= maxValue; i++) {
            if(i % 12 == 0) total += i;
            else continue;
        }
        System.out.println("Total : " + total);
    }
}
