import java.util.Scanner;

public class PromotionClass {
    public static void main(String[] args) {
        int mat,turk,physics,chemistry,history,music;
        Scanner input = new Scanner(System.in);

        System.out.print("Math Grade :");
        mat = input.nextInt();

        System.out.print("Türkçe Grade :");
        turk = input.nextInt();

        System.out.print("Physics Grade :");
        physics = input.nextInt();

        System.out.print("Chemistry Grade :");
        chemistry = input.nextInt();

        System.out.print("History Grade :");
        history = input.nextInt();

        System.out.print("Music Grade :");
        music = input.nextInt();

        double average = (mat + turk + physics + chemistry + history + music) / 6.0;

        if(average > 100 && average < 0) {
            System.out.println("Grades entered are not valid");
        }
        else if(average > 55) {
            System.out.println("You passed the class");
        }
        else {
            System.out.println("You couldn't pass the class");
        }
    }
}
