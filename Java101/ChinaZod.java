import java.util.Scanner;

public class ChinaZod {
    public static void main(String[] args) {
        int date;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your birthdate(year) :");
        date = sc.nextInt();

        int zod = date % 12;
        switch(zod){
            case 0 -> System.out.println("Your zod is Monkey");
            case 1 -> System.out.println("Your zod is Cockerel");
            case 2 -> System.out.println("Your zod is Dog");
            case 3 -> System.out.println("Your zod is Pig");
            case 4 -> System.out.println("Your zod is Mouse");
            case 5 -> System.out.println("Your zod is Ox");
            case 6 -> System.out.println("Your zod is Tiger");
            case 7 -> System.out.println("Your zod is Rabbit");
            case 8 -> System.out.println("Your zod is Dragon");
            case 9 -> System.out.println("Your zod is Snake");
            case 10 -> System.out.println("Your zod is Horse");
            case 11 -> System.out.println("Your zod is Sheep");
        }
        
    }
}
