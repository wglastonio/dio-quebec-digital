package resources;
public class Emprestimo {

    public static void calcular(int valor, int parcelas) {
        double valorF;
        if (parcelas == 2) {
            valorF = valor + (valor * getTaxaDuasParcelas());
            mostraValor(parcelas, valorF);
        } else if (parcelas == 3) {
            valorF = valor + (valor * getTaxaTresParcelas());
            mostraValor(parcelas, valorF);
        } else {
            mostraValor();
        }
    }

    private static double getTaxaDuasParcelas() {
        return 0.3;
    }

    private static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static int getDuasParcelas() {
        return 2;
    }
    
    public static int getTresParcelas() {
        return 3;
    }

    private static void mostraValor() {
        System.out.println("\n!!! Quantidade de parcelas inválidas !!!");
    }

    private static void mostraValor(int parcelas, double valorF) {
        System.out.println("Valor do empréstimo para " + parcelas + " é de: " + valorF);
    }
}
