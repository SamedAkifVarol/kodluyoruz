import java.util.Scanner;

public class Hipotanus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        double c;

        System.out.print("Bir kenar giriniz : ");
        a = sc.nextInt();

        System.out.print("Bir daha kenar giriniz : ");
        b = sc.nextInt();

        c = Math.sqrt((a*a) + (b*b));

        System.out.print("Hipotenüs : " + c);
    }
}
