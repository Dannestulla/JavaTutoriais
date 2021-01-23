/* Hashmap são que nem dicionários do Python
 */
import java.util.HashSet;
import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, String> capitaisDeCidades = new HashMap<String, String>();
        capitaisDeCidades.put("Inglaterra", "Londres");
        capitaisDeCidades.put("Alemanha", "Berlin");
        System.out.println(capitaisDeCidades);
        HashSet<Integer> numeros = new HashSet<Integer>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);
        numeros.add(13);
        System.out.println(numeros);

        // Show which numbers between 1 and 10 are in the set
        for (int i = 1; i <= 10; i++) {
            if (numeros.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }
    }
}
}
