import java.util.ArrayList;
import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte cislo.");
        int q = 0;
        int w = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            w += list.get(i);
        }

        double z = (double)w / list.size();
        for (int a = 0; a < list.size(); a++) {
            if(list.get(a) >= z){
                q = q + list.get(a);
            }
        }
        System.out.println(q);
    }
}
