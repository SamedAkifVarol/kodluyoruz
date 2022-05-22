import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int starNumber = sc.nextInt();

        for(int i = 0 ; i < starNumber ; i++) {
            for(int j = 0 ; j <(starNumber-i); j++) {
                System.out.print(" ");
            }
            for(int k = 1 ; k <= (2 * i + 1) ; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for(int i = 3; i >= 0 ; i--) {
            for(int j = 0 ; j<3-i;j++) {
                System.out.print(" ");
            }
            for(int j = 0;j<i * 2 ; j++) {
                System.out.print("*");
            }
            for(int k = starNumber;k<=i;k++){
                System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
