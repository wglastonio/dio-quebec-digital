public class Main {
    public static void main(String[] args) throws Exception {

        Cliente cl1 = new Cliente();
        cl1.setNome("Joao da Silva");
        
        Conta cc1 = new ContaCorrente(cl1);
        Conta cp1 = new ContaPoupanca(cl1);

        cc1.depositar(100.00);
        cc1.tranferir(25.00, cp1);

        cc1.imprimirExtrato();
        cp1.imprimirExtrato();
    }
}
