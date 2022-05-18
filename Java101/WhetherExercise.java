import java.util.Scanner;

public class WhetherExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float temperature;

        System.out.println("Enter the Whether Temparature : ");
        temperature = sc.nextFloat();

        if(temperature > 25.0) {
            System.out.println("Go to Swimming");
        }
        else if(temperature <= 25.0) {
            System.out.println("Go to the Picnic");
        }
        else if (temperature <= 15.0) {
            System.out.println("Go to the Cinema");
        }
        else if (temperature <= 5.0) {
            System.out.println("Go to the Ski");
        }
    }
}
