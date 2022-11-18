public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n------------------------------");
        System.out.println("|   Extrato conta poupança   |");
        System.out.println("------------------------------");
        super.imprimirInfoBase();    
    }
}
