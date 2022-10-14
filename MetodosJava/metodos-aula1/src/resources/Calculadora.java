package resources;
public class Calculadora {

    public static void soma (double n1, double n2) {
        double result = n1 + n2;
        System.out.println("Soma de " + n1 + " e " + n2 + "         --> " + result);
    }
    
    public static void subtracao (double n1, double n2) {
        double result = n1 - n2;
        System.out.println("Diferença entre " + n1 + " e " + n2 + " --> " + result);
    }

    public static void multiplicacao (double n1, double n2) {
        double result = n1 * n2;
        System.out.println("Produto entre " + n1 + " e " + n2 + "   --> " + result);
    }

    public static void divisao (double n1, double n2) {
        if (n2 == 0) {
            System.out.println("ERRO -- Não existe divisão por zero!");
        } else {
            double result = n1 / n2;
            System.out.println("Divisão de " + n1 + " por " + n2 + "    --> " + result);
        }
    }
}
