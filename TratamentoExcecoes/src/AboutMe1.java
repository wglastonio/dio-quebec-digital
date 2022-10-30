import java.util.Locale;
import java.util.Scanner;

public class AboutMe1 {
    public static void main(String[] args) {
        
        // Coleta de dados
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.next();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        // Imprime dados coletados
        System.out.println("Olá, me chamo " + nome.toUpperCase() +
                           " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
    }
}
