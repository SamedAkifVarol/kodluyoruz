import java.util.Scanner;

public class matris {
    public static void main(String[] args) {
        int a, b;
        Scanner tara = new Scanner(System.in);
        System.out.print("Matrisin ([a][b]) satir boyutunu giriniz (a):");
        a= tara.nextInt();
        System.out.print("Matrisin ([a][b]) sutun boyutunu giriniz (b):");
        b= tara.nextInt();
        int[][] matris = new int[a][b];

        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.printf("%d. satir %d. sutun elementini giriniz:",i+1,j+1);
                matris[i][j]= tara.nextInt();
            }
        }

        System.out.println("Girilen 2 boyutlu dizi:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpoze edilen 2 boyutlu dizi:");
        for(int i=0;i<b;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(matris[j][i]+" ");
            }
            System.out.println();
        }

        
    }
}
