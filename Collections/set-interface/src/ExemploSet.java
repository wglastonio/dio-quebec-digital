import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7.8d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Existe nota 5.0: " + notas.contains(5d));
        System.out.println("Menor nota: " + Collections.min(notas));
        System.out.println("Maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos elementos: " + soma);
        System.out.println("Média dos elementos: " + soma/notas.size());

        notas.remove(0d);
        System.out.println(notas.toString());

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7d) {
                iterator1.remove();
            }
        }
        System.out.println(notas.toString());

        Set<Double> notas1 = new LinkedHashSet<>();  //Mostrar as notas na mesma ordem em que foram inseridas
        notas1.add(7d);
        notas1.add(8.5);
        notas1.add(9.3);
        notas1.add(5d);
        notas1.add(7.8);
        notas1.add(0d);
        notas1.add(3.6);
        System.out.println(notas1.toString());


        Set<Double> notas2 = new TreeSet<>(notas1);
        System.out.println("Ordem crescente: " + notas2);

        notas.clear();
        System.out.println("Notas: " + notas);

    }
}
