import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TriagemCrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Coleta de informações
        System.out.print("Telefonou para a vítima? ");
        String telefonou = input.nextLine();

        System.out.print("Esteve no local do crime? ");
        String esteveCom = input.nextLine();

        System.out.print("Mora perto da vítima? ");
        String moraPerto = input.nextLine();

        System.out.print("Devia para a vítima? ");
        String devia = input.nextLine();

        System.out.print("Já trabalhou com a vítima? ");
        String trabalhou = input.nextLine();

        input.close();

        // Adiciona dados na lista
        List<Triagem> tr = new ArrayList<>() {{
            add (new Triagem(telefonou, esteveCom, moraPerto, devia, trabalhou));
        }};
        System.out.println("Triagem: " + tr);

        // Realiza triagem
        Iterator<Triagem> tr1 = tr.iterator();
        int cont = 0;
        while (tr1.hasNext()) {
            Triagem t = tr1.next();
            if (t.getTelefonou().equals("sim")) cont += 1;
            if (t.getEsteveCom().equals("sim")) cont += 1;
            if (t.getMoraPerto().equals("sim")) cont += 1;
            if (t.getDevia().equals("sim")) cont += 1;
            if (t.getTrabalhou().equals("sim")) cont += 1;
        }

        // Apresenta resultado
        if (cont == 2) {
            System.out.println("Pessoa suspeita");
        }
        else if (cont == 3 || cont == 4) {
            System.out.println("Pessoa cúmplice");
        }
        else if (cont == 5) {
            System.out.println("Pessoa assassina");
        }
        else {
            System.out.println("Pessoa inocente");
        }
    }
}

class Triagem {
    private String telefonou;
    private String esteveCom;
    private String moraPerto;
    private String devia;
    private String trabalhou;
    
    public Triagem(String telefonou, String esteveCom, String moraPerto, String devia, String trabalhou) {
        this.telefonou = telefonou;
        this.esteveCom = esteveCom;
        this.moraPerto = moraPerto;
        this.devia = devia;
        this.trabalhou = trabalhou;
    }

    public String getTelefonou() {
        return telefonou;
    }

    public String getEsteveCom() {
        return esteveCom;
    }

    public String getMoraPerto() {
        return moraPerto;
    }

    public String getDevia() {
        return devia;
    }

    public String getTrabalhou() {
        return trabalhou;
    }

    @Override
    public String toString() {
        return "telefonou=" + telefonou + ", esteveCom=" + esteveCom + ", moraPerto=" + moraPerto + ", devia="
                + devia + ", trabalhou=" + trabalhou;
    }
}

