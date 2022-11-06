import java.util.Scanner;

public class PreencheSequencia {
    public static void main(String[] args) throws Exception {
        //Preeche vetor com sequencia
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        if (t >=2 && t <= 50) {
            //int[] vetor = new int[1000];
            for (int i = 0; i < 1000;) {
                for (int j = 0; j < t; j++) {
                    if (i < 1000) {
                        System.out.println("N[" + i + "] = " + j);
                        i++;
                    }
                }
            }

        }
        input.close();
    }
}
