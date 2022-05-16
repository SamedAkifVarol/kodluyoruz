import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Float ucret = 10f;
        Float kmBası = 2.20f;
        Float gidilenKm;
        
        System.out.print("Gideceğiniz KM giriniz : ");
        gidilenKm = sc.nextFloat();

        Float total = ucret + (gidilenKm * kmBası);
        if(total <= 20f) {
            System.out.println("Ödenecek Tutar : " + 20f);
        }
        else {
            System.out.println("Ödenecek Tutar : " + total + " TL'dir.");
        }

    }
}
