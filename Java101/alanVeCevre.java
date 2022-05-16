import java.util.Scanner;

public class alanVeCevre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        double r;    

        System.out.print("-------------\n1)Alan\n2)Çevre\n----------\nBirini Seçin :");
        a = sc.nextInt();

        if(a == 1) {
            System.out.print("Yarıçapı giriniz : ");
            r = sc.nextDouble();
            double alan = (Math.PI) * (r*r);
            System.out.println("Alan : " + alan);
        }
        else if (a == 2) {
            System.out.print("Yarıçapı giriniz : ");
            r = sc.nextDouble();
            double cevre = 2*Math.PI*r;
            System.out.println("Çevre : " + cevre);
        }
    }
}
