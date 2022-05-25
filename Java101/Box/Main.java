package Box;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
        Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
        
        ArrayList<Fighter> list = new ArrayList<>();
        list.add(marc);
        list.add(alex);

        Random random = new Random();
        int fighter = random.nextInt(list.size());

        System.out.println("First is : " + list.get(fighter));

        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
      }
}
