import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);
        
        Iterator<Double> iterator = notas.iterator();
        
        while (iterator.hasNext()) {
            Double next = iterator.next();
            if (next < 8) {
                iterator.remove();
            }
        }
        
        System.out.println(notas);
    }
}
