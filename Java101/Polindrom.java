import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
    Scanner girdi = new Scanner(System.in);
    System.out.println("Lütfen bir tamsayı yazın");
    int sayi = girdi.nextInt();
 
    String str = String.valueOf(sayi);
    int i = 0;
    int j = str.length() - 1;
    boolean kontrol = true;
    while (i < j) {
        if (str.charAt(i++) != str.charAt(j--)) {
            kontrol = false;
            break;
        }
    }
 
    if (kontrol)
	    System.out.println(sayi+" sayısı palindrom bir sayıdır");
    else
	    System.out.println(sayi+" sayısı palindrom bir sayı değildir");
        }
}
