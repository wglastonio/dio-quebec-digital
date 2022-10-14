import resources.Calculadora;
import resources.Emprestimo;
import resources.Mensagem;

public class Main {
    public static void main(String[] args) throws Exception {
        // Calculadora
        System.out.println("\n### Calculadora ###");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        // Mensagem
        System.out.println("\n### Mensagem ###");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("\n### Empréstimo ###");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        System.out.println("\n");
    }
}
