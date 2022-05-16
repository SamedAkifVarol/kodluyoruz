import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float armut = 2.14f;
        float elma = 3.67f;
        float domates = 1.11f;
        float muz = 0.95f;
        float patlican = 5f;

        System.out.println("Kaç kg armut alacaksınız ? : ");
        float armutKg = sc.nextFloat();
        float armutPrice = armut * armutKg;

        System.out.println("Kaç kg elma alacaksınız ? : ");
        float elmaKg = sc.nextFloat();
        float elmaPrice = elma * elmaKg;

        System.out.println("Kaç kg domates alacaksınız ? : ");
        float domatesKg = sc.nextFloat();
        float domatesPrice = domates * domatesKg;

        System.out.println("Kaç kg patlican alacaksınız ? : ");
        float patlicanKg = sc.nextFloat();
        float patlicanPrice = patlican * patlicanKg;

        System.out.println("Kaç kg muz alacaksınız ? : ");
        float muzKg = sc.nextFloat();
        float muzPrice = muz * muzKg;

        float total = armutPrice + elmaPrice + domatesPrice + patlicanPrice + muzPrice;
        System.out.println("Ödemeniz gereken tutar : " + total);
    }
}
