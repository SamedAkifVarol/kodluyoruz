import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter your number : ");
        int n = sc.nextInt();
        int beginning = n;
        for (;n > 0; n -= 5){
            System.out.print(n + " ");
        }

        for(;n <= beginning; n += 5){
            System.out.print(n + " ");
        }
    }
}
