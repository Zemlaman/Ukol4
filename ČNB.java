import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ČNB {
    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("C:\\Users\\Zemla\\IdeaProjects\\Úkol_8.11\\src\\denni_kurz.txt");
        Scanner sc = new Scanner(text);

        Scanner sc2 = new Scanner(System.in);

        HashMap<String, Double> whole = new HashMap();
        int choose;
        double count;
        double result;
        double kurzDbl;
        String first;
        String second;
        boolean  anew = false;

        while (sc.hasNext()) {
            String kurz = sc.nextLine();
            System.out.println(kurz);
            String[] apart = kurz.split(":", 2);
            if (apart.length >= 2) {
                String name = apart[0];
                String value = apart[1];
                kurzDbl = Double.parseDouble(value);
                whole.put(name, kurzDbl);
            }
        } //shoutout robíkovy za tenhle hnus while 🥰

        do {
            System.out.println("Zadejte pocet penez, prvni menu a druhou menu");
            count = sc2.nextDouble();
            first = sc2.next();
            second = sc2.next();
            double kurz1 = whole.get(first);
            double kurz2 = whole.get(second);
            result = (count * kurz1) / kurz2;

            System.out.println(Math.floor(result));

            System.out.println("Chcete zadat dalsi meny, 1 pro ano 2 pro ne");
                choose = sc2.nextInt();
                if(choose == 1) {
                    anew = true;
                } else if (choose == 2) {
                    anew = false;
                }
        }while(anew);
    }
}
