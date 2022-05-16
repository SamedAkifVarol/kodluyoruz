import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Tutarı Sayı Cinsinden Giriniz :");
        int tutar = sc.nextInt();

        if(tutar > 1000) {
            int kdv = (tutar / 100) * 9 ;
            int gercekDeger = tutar - kdv ;
            System.out.println("Ürünün gerçek fiyatı : " + gercekDeger + " " + "KDV'si : " + kdv);    
        } 
        else {
            int kdv = (tutar / 100) * 18 ;
            int gercekDeger = tutar - kdv ;
            System.out.println("Ürünün gerçek fiyatı : " + gercekDeger + " " + "KDV'si : " + kdv);  
        }
    }
}
