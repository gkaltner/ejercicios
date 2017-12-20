import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {


    }

    public int NumMasPopular(int[] array, int size) {
        TreeMap<Integer, Integer> populares = new TreeMap<Integer, Integer>();
        Integer popular;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    popular = populares.get(array[i]);
                    if (popular != null) {
                        populares.put(array[i], popular + 1);
                    } else {
                        populares.put(array[i], 1);
                    }
                }
            }
        }
        Map.Entry<Integer, Integer> masPopular = null;
        for (Map.Entry<Integer, Integer> entry : populares.entrySet()) {
            if (masPopular == null) {
                masPopular = entry;
            } else {
                if (masPopular.getValue() < entry.getValue() || (masPopular.getValue().equals(entry.getValue()) && masPopular.getKey() > entry.getKey())) {
                    masPopular = entry;
                }
            }
        }
        return masPopular.getKey() != null ? masPopular.getKey() : 0;
    }
}
