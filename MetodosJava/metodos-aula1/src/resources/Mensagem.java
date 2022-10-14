package resources;
public class Mensagem {

    public static void obterMensagem(int i) {
        if (i > 0 && i < 12) {
            System.out.println("Bom dia!");
        }
        if (i > 12 && i < 18) {
            System.out.println("Boa tarde!");
        }
        if (i > 18 && i < 24) {
            System.out.println("Boa Noite!");
        }
        if (i < 0 && i > 24) {
            System.out.println("Hora inválida!");
        }
    }

}
