import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float boy,kilo;

        System.out.print("Lütfen boyunuzu giriniz : ");
        boy = sc.nextFloat();

        System.out.print("Lütfen Kilonuzu giriniz : ");
        kilo = sc.nextFloat();

        float bmi = kilo / (boy * boy);

        System.out.println("Beden Kitle İndeksiniz : " + bmi);
    }
}
