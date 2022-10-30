public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
           System.out.println("O valor do CEP é inválido!");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        // Simulando Cep formatado
        return "23.765-064";
    }
}
