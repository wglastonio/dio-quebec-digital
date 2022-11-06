import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ExemploOrdenaMap {
    public static void main(String[] args) {

        System.out.println("\n-- Ordem aleatória --");
        Map<String, Livro> meusLivros1 = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        
        for(Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getLivro());
        }


        System.out.println("\n-- Ordem de inserção --");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o Século 21", 432));
        }};
        for(Map.Entry<String, Livro> livro: meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getLivro());
        }


        System.out.println("\n-- Ordem alfabética dos autores --");
        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros2);   //TreeMap vai ordenar pela chave do objeto principal
        for(Map.Entry<String, Livro> livro: meusLivros3.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getLivro());
        }


        System.out.println("\n-- Ordem alfabética dos livros --");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorLivro());   //TreeSet vai ordenar pela chave do objeto secundario
        meusLivros4.addAll(meusLivros3.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros4) {
            System.out.println(livro.getKey() + " - " +
                               livro.getValue().getLivro() + " - " +
                               livro.getValue().getPaginas());
        }

        System.out.println("\n-- Ordem do número de páginas --");
        Set<Map.Entry<String, Livro>> meusLivros5 = new TreeSet<>(new ComparatorPaginas());   //TreeSet vai ordenar pela chave do objeto secundario
        meusLivros5.addAll(meusLivros3.entrySet());
        for(Map.Entry<String, Livro> livro: meusLivros5) {
            System.out.println(livro.getKey() + " - " +
                               livro.getValue().getLivro() + " - " +
                               livro.getValue().getPaginas());
        }


    };
}


class Livro {
    private String autor;
    private String livro;
    private Integer paginas;
    
    public Livro(String livro, Integer paginas) {
        this.livro = livro;
        this.paginas = paginas;
    }

    public String getLivro() {
        return livro;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public String toString() {
        return "Livros [autor=" + autor + ", livro=" + livro + ", paginas=" + paginas + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
        result = prime * result + ((livro == null) ? 0 : livro.hashCode());
        result = prime * result + ((paginas == null) ? 0 : paginas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Livro other = (Livro) obj;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        if (livro == null) {
            if (other.livro != null)
                return false;
        } else if (!livro.equals(other.livro))
            return false;
        if (paginas == null) {
            if (other.paginas != null)
                return false;
        } else if (!paginas.equals(other.paginas))
            return false;
        return true;
    }
}

class ComparatorLivro implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return livro1.getValue().getLivro()
                     .compareToIgnoreCase(livro2.getValue().getLivro());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Entry<String, Livro> livro1, Entry<String, Livro> livro2) {
        return livro1.getValue().getPaginas()
                     .compareTo(livro2.getValue().getPaginas());
    }
}