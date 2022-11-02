import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinguagemFavorita {
    public static void main(String[] args) {
        System.out.println("\n-- Ordena por entrada --");
        Set<Linguagem> lang1 = new LinkedHashSet<>() {{
            add(new Linguagem("Java", 1998, "ItelliJ"));
            add(new Linguagem("Python", 2000, "VS Code"));
            add(new Linguagem("Javascript", 2002, "Eclipse"));
        }};
        
        for (Linguagem l: lang1) System.out.println(l.getNome() + " - " +
                                                   l.getAno() + " - " +
                                                   l.getIde());


        System.out.println("\n-- Ordena por nome --");
        Set<Linguagem> lang2 = new TreeSet<>(new ComparatorNomeLang());
        lang2.addAll(lang1);
        for (Linguagem l: lang2) System.out.println(l.getNome() + " - " +
                                                   l.getAno() + " - " +
                                                   l.getIde());
        

        System.out.println("\n-- Ordena por IDE --");
        Set<Linguagem> lang3 = new TreeSet<>(new ComparatorIde());
        lang3.addAll(lang1);
        for (Linguagem l: lang3) System.out.println(l.getNome() + " - " +
                                                   l.getAno() + " - " +
                                                   l.getIde());

                                                   
        System.out.println("\n-- Ordena por Ano --");
        Set<Linguagem> lang4 = new TreeSet<>(new ComparatorAno());
        lang4.addAll(lang1);
        for (Linguagem l: lang4) System.out.println(l.getNome() + " - " +
                                                   l.getAno() + " - " +
                                                   l.getIde());

        
        System.out.println("\n-- Ordena por Ano --");
        Set<Linguagem> lang5 = new TreeSet<>(new ComparatorNomeAnoIde());
        lang5.addAll(lang1);
        for (Linguagem l: lang5) System.out.println(l.getNome() + " - " +
                                                   l.getAno() + " - " +
                                                   l.getIde());

        
        System.out.println("\n-- Lista de linguagens --");
        for (Linguagem l: lang1) System.out.println(l.getNome());
    }
}

class Linguagem {
    private String nome;
    private Integer ano;
    private String ide;
    
    public Linguagem(String nome, Integer ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "[nome=" + nome + ", ano=" + ano + ", ide=" + ide + "]";
    }
}

class ComparatorNomeLang implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem lang1, Linguagem lang2) {
        int nome = lang1.getNome().compareTo(lang2.getNome());
        return nome;
    }
}

class ComparatorIde implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem lang1, Linguagem lang2) {
        int ide = lang1.getIde().compareTo(lang2.getIde());
        return ide;
    }
}

class ComparatorAno implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem lang1, Linguagem lang2) {
        int ano = lang1.getAno().compareTo(lang2.getAno());
        return ano;
    }
}

class ComparatorNomeAnoIde implements Comparator<Linguagem> {
    @Override
    public int compare(Linguagem lang1, Linguagem lang2) {
        int nome = lang1.getNome().compareTo(lang2.getNome());
        if (nome != 0) return nome;

        int ano = lang1.getAno().compareTo(lang2.getAno());
        if (ano != 0) return ano;

        int ide = lang1.getIde().compareTo(lang2.getIde());
        return ide;
    }
}