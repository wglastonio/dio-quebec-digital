import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        LinkedList<Double> notas = new LinkedList<>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas);
        
        System.out.println("1a nota: " + notas.getFirst());
        System.out.println("1a nota: " + notas.removeFirst());
        
        System.out.println(notas);
    }
    
}
