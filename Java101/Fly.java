import java.util.Scanner;

public class Fly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distance,direction,age;
        double total = 0;
        double price = 0.10;
        int select;

        System.out.print("How many kilometres will you travel : ");
        distance = sc.nextDouble();

        System.out.print("Enter your age :");
        age = sc.nextDouble();

        System.out.println("-----\nTravel type\n1)Departure\n2)Round-Trip\n-----\nChoose it : ");
        select = sc.nextInt();

        System.out.println(total);

        switch (select) {
            case 1:
                total = distance * price ;
            case 2:
                total = (distance * price) * 0.8;
            default:
                System.out.println("Selected value is not valid");
        }
        if(age<12) System.out.println("Total Price : " +total/2);
        else if(age <=24) System.out.println("Total price : " + total * 0.9);
        else if(age >= 65) System.out.println("Total price : " + total * 0.8);
        else System.out.println("Total price : " + total);
    }
}
