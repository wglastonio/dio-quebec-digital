import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TemperaturaMedia { 
    public static void main(String[] args) {
        List<Temperatura> temp = new ArrayList<>() {{
            add (new Temperatura("Janeiro", 25.7));
            add (new Temperatura("Fevereiro", 24.8));
            add (new Temperatura("Março", 32.1));
            add (new Temperatura("Abril", 22.4));
            add (new Temperatura("Maio", 25.8));
            add (new Temperatura("Junho", 23.9));
            add (new Temperatura("Julho", 19.7));
        }};
        System.out.println("Lista de temperaturas: " + temp); 

        // Calcula temperatura média
        Iterator<Temperatura> it1 = temp.iterator();
        Double media = 0d;
        while (it1.hasNext()) {
            Temperatura t = it1.next();
            Double t1 = t.getTemp();
            media += t1 / temp.size();
        }
        System.out.printf("Temperatura média: %.2f \n", media);

        // Mostra temperaturas acima da média
        Iterator<Temperatura> it2 = temp.iterator();
        while (it2.hasNext()) {
            Temperatura t = it2.next();
            if (t.getTemp() > media) {
                System.out.println("Temperatura acima da média: " + t);
            }
        }

    }
}

class Temperatura {
    private String mes;
    private Double temp;

    public Temperatura(String mes, Double temp) {
        this.mes = mes;
        this.temp = temp;
    }

    public String getMes() {
        return mes;
    }

    public Double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "[" + mes + ": " + temp + "o" + "]";
    }
}