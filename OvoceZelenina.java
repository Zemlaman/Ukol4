import java.util.HashSet;
import java.util.Scanner;

public class OvoceZelenina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> f = new HashSet<>();
        HashSet<String> v = new HashSet<>();
        String name;

        System.out.println("Zadejte pocet zeleniny");
        int vcount = sc.nextInt();
        for (int i = 0; i < vcount; i++) {
            System.out.println("Zadejete zeleninu");
            String veg = sc.next();
            if (v.contains(veg)) {
                i--;
                System.out.println("Zadejte zeleninu, kterou jste jiz nezadal");
            } else v.add(veg);
        }

        System.out.println("Zadejte pocet ovoce");
        int fcount = sc.nextInt();
        for (int x = 0; x < fcount; x++) {
            System.out.println("Zadejte ovoce");
            String fru = sc.next();
            if (f.contains(fru)) {
                x--;
                System.out.println("Zadejte ovoce, ktere jste jiz nezadal");
            } else f.add(fru);
        }

        do{
            System.out.println("Zadej nazev");
            name = sc.next();
            if (v.contains(name)) {
                System.out.println("zelenina");
            } else if (f.contains(name)) {
                System.out.println("ovoce");
            } else if (!v.contains(name) && !f.contains(name) && !name.equals("END")) {
                System.out.println("ostatni");
            }
        } while(!name.equals("END"));
    }
}