public abstract class Conta implements interfaceConta {

    private static final int AGENCIA_PADRAO = 8888;
    private static int SEQUENCIAL = 1111;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
        
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfoBase() {
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));    
        System.out.println(String.format("Agencia: %d", this.agencia));    
        System.out.println(String.format("Número: %d", this.numero));    
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("------------------------------\n");
    }
}
