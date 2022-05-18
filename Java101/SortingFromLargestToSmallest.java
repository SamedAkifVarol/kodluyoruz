import java.util.Scanner;

public class SortingFromLargestToSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.print("Enter the first number : ");
        a = sc.nextInt();

        System.out.print("Enter the second number : ");
        b = sc.nextInt();

        System.out.print("Enter the third number : ");
        c = sc.nextInt();

        if(a > b && a > c) {
            if(b>c){
                System.out.println(a + " > " + b + " > " + c);
            }
            else if(c>b) {
                System.out.println(a + " > " + c + " > " + b);
            }
        }
        else if (b > a && b > c) {
            if(a > c) {
                System.out.println(b + " > " + a + " > " + c);
            }
            if(c > a ) {
                System.out.println(b + " > " + c + " > " + a);
            }
        }
        else {
            if (b > a) {
                System.out.println(c + " > " + b + " > " + a);
            }
            else {
                System.out.println(c + " > " + a + " > " + b);
            }
        }
    }
}
