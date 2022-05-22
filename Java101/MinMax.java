import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("How many number do you enter ? : ");
       int n = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i = 0 ; i < n ; i++) {
            System.out.print("Please enter your number : ");
            int m = sc.nextInt();
            
            list.add(m);
       }

       int numberMax = list.get(0);
       int numberMin = list.get(0);

       for(int j = 0; j < list.size(); j++) {
            if(list.get(j) > numberMax){
                numberMax = list.get(j);
            }
            else if(list.get(j) < numberMin){
                numberMin = list.get(j);
            }
       }

       System.out.println("Max Value : " + numberMax);
       System.out.println("Min Value : " + numberMin);
       
    }
}
