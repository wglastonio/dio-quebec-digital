public class RetornaPares {
    public static void main(String[] args) throws Exception {
        //Retornar pares
        int[] lista = {2, 3, 5, 7, 11, 13, 18, 34};

        for (int i: lista) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
