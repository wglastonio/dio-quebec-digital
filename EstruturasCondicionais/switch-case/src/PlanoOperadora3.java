public class PlanoOperadora3 {
    public static void main(String[] args) {
        String plano = "T"; //B M T

        if (plano == "B" || plano == "M" || plano == "T") {
            System.out.println("100 minutos de ligação.");
        }
        if (plano == "M" || plano == "T") {
            System.out.println("Whats e Instagram grátis.");
        }
        if (plano == "T") {
            System.out.println("5Gb Youtube.");
        }
    }
}
