
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Zliczanie {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = new TreeMap<>();
        FileReader fileReader = new FileReader("liczby.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String a = "";
        int i = 0;
        int ile = 1;
        while ((a = bufferedReader.readLine()) != null) {
            if (!map.containsKey(a)) {
                map.put(a, 1);
            } else if (map.containsKey(a)) {
                ile = map.get(a);
                map.remove(a);
                map.put(a, ile + 1);
            }
        }
        System.out.println(map);
    }
}