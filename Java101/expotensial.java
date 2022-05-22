import java.util.Scanner;

public class expotensial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int a = sc.nextInt();

        System.out.println("Enter your expo : ");
        int b = sc.nextInt();

        System.out.println(expo(a, b));

    }
    public static int expo(int a ,int b) {
        if(b>0){
            return a * expo(a, b-1);
        }else{
            return 1;
        }
    }
}
