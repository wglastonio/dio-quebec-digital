import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class ArcoIris {
    public static void main(String[] args) {

        Set<String> arcoIris1 = new LinkedHashSet<>() {{
            add(new String("Vermelho"));
            add(new String("Laranja"));
            add(new String("Amarelo"));
            add(new String("Verde"));
            add(new String("Azul"));
            add(new String("Anil"));
            add(new String("Violeta"));
        }};

        System.out.println("\n-- Exibe as cores na ordem informada --");
        for (String cor: arcoIris1) System.out.println(cor);

        System.out.println("\n-- Quantidade de cores --");
        System.out.println(arcoIris1.size());
        

        System.out.println("\n-- Ordem alfabética --");
        Set<String> arcoIris2 = new TreeSet<>() {{
            add(new String("Vermelho"));
            add(new String("Laranja"));
            add(new String("Amarelo"));
            add(new String("Verde"));
            add(new String("Azul"));
            add(new String("Anil"));
            add(new String("Violeta"));
        }};
        for (String cor: arcoIris2) System.out.println(cor);


        System.out.println("\n-- Exibe as cores na ordem inversa da informada --");
        ArrayList<String> arcoIris3 = new ArrayList<String>(arcoIris1);
        Collections.reverse(arcoIris3);
        for (String cor: arcoIris3) System.out.println(cor);
        

        System.out.println("\n-- Exibe as cores iniciadas com v --");
        for (String cor: arcoIris1) {
            if (cor.startsWith("V") || cor.startsWith("v")) System.out.println(cor);   
        }


        System.out.println("\n-- Remove as cores não iniciadas com V --");
        Set<String> arcoIris4 = new HashSet<>(arcoIris1);
        arcoIris4.removeIf(n -> (!(n.startsWith("V") || n.startsWith("v"))));
        System.out.println(arcoIris1);
        System.out.println(arcoIris4);


        System.out.println("\n-- Limpar o conjunto --");
        Set<String> arcoIris5 = new HashSet<>(arcoIris1);
        arcoIris5.clear();
        System.out.println(arcoIris5);
    }
}

class ComparatorNome implements Comparator<String> {

    @Override
    public int compare(String cor1, String cor2) {
        int cor = cor1.compareTo(cor2);
        return cor;
    }

}





