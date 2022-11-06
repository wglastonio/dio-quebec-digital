import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        //Ordem aleatória
        System.out.println("\n-- Ordem aleatória --");
        Set<Serie> minhasSeries1 = new HashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " +
                                                           serie.getGenero() + " - " +
                                                           serie.getTempoEpisodio());
        
        //Ordem de inserção
        System.out.println("\n-- Ordem de inserção --");
        Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " +
                                                           serie.getGenero() + " - " +
                                                           serie.getTempoEpisodio());

        //Ordem natural (tempo de episódio)
        System.out.println("\n-- Ordem natural (tempo de episódio) --");
        Set<Serie> minhasSeries3 = new TreeSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " +
                                                           serie.getGenero() + " - " +
                                                           serie.getTempoEpisodio());

        //Ordem Nome-Genero-TempoEpisodio
        System.out.println("\n-- Ordem Nome-Genero-TempoEpisodio --");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries4.addAll(minhasSeries1);
        
        for (Serie serie: minhasSeries4) System.out.println(serie.getNome() + " - " +
                                                           serie.getGenero() + " - " +
                                                           serie.getTempoEpisodio());
    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }
    public String getGenero() {
        return genero;
    }
    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }
    @Override
    public String toString() {
        return "[nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
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
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        int genero = this.getGenero().compareTo(serie.getGenero());
        return genero;
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        int nome = serie1.getNome().compareTo(serie2.getNome());
        if (nome != 0) return nome;

        int genero = serie1.getGenero().compareTo(serie2.getGenero());
        if (genero != 0) return genero;
        
        int tempoEpisodio = Integer.compare(serie1.getTempoEpisodio(), serie2.getTempoEpisodio());
        return tempoEpisodio;
    }

}