import java.util.Scanner;

public class ValorPagamento {
    public static void main(String[] args) throws Exception {
        //Mostrar mensagem
        Scanner leitor = new Scanner(System.in);

        int cod1 = leitor.nextInt();
        int n1 = leitor.nextInt();
        double valor1 = leitor.nextDouble();

        int cod2 = leitor.nextInt();
        int n2 = leitor.nextInt();
        double valor2 = leitor.nextDouble();

        double total = (n1 * valor1) + (n2 * valor2);
        System.out.printf(String.format("VALOR A PAGAR: R$ %.2f", total));

        leitor.close();
    }
}
