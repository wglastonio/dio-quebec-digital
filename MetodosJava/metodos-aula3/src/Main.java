public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("\n--- Atividade quadrilátero ---");
        System.out.println("Área do quadrado: " + Quadrilatero.area(4));
        System.out.println("Área do retângulo: " + Quadrilatero.area(5d, 5d));
        System.out.println("Área do trapézio: " + Quadrilatero.area(7, 8, 2));
        System.out.println("Área do losango: " + Quadrilatero.area(5f, 5f));
        System.out.println("\n");
    }
}
