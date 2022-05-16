import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat,turk,fizik,kimya,tarih,muzik;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz :");
        mat = input.nextInt();

        System.out.print("Türkçe Notunuz :");
        turk = input.nextInt();

        System.out.print("Fizik Notunuz :");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz :");
        kimya = input.nextInt();

        System.out.print("Tarih Notunuz :");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz :");
        muzik = input.nextInt();

        double ortalama = (mat + turk + fizik + kimya + tarih + muzik) / 6.0;
        
        boolean kosul1 = ortalama >= 60.0;
        boolean kosul2 = ortalama < 60.0;
        boolean sonuc = kosul1 || kosul2; 
        
        String str = (sonuc) ? "Geçti" : "Kaldı";
        
        System.out.println("Ortalaması : " + ortalama + " " + str);

        
    }
}