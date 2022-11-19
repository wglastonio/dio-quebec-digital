// public abstract class Conta implements interfaceConta {

//     private static final int AGENCIA_PADRAO = 8888;
//     private static int SEQUENCIAL = 1111;

//     protected Bank banco;
//     protected int agencia;
//     protected int accNumber;
//     protected double balance;
//     protected Client client;
//     private String accType;

//     public Conta(Client client, String accType, Double balance) {
//         this.agencia = AGENCIA_PADRAO;
//         this.accNumber = SEQUENCIAL++;
//         this.client = client;
//         this.accType = accType;
//         this.balance = balance;
//     }

//     @Override
//     public void depositar(double valor) {
//         this.balance += valor;   
//     }

//     @Override
//     public void sacar(double valor) {
//         this.balance -= valor;
//     }

//     @Override
//     public void tranferir(double valor, Conta contaDestino) {
//         this.sacar(valor);
//         contaDestino.depositar(valor);        
//     }


//     public Bank getBanco() {
//         return banco;
//     }

//     public void setBanco(Bank banco) {
//         this.banco = banco;
//     }

//     public int getAgencia() {
//         return agencia;
//     }

//     public void setAgencia(int agencia) {
//         this.agencia = agencia;
//     }

//     public int getAccNumber() {
//         return accNumber;
//     }

//     public void setAccNumber(int accNumber) {
//         this.accNumber = accNumber;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void setBalance(double balance) {
//         this.balance = balance;
//     }

//     public Client getClient() {
//         return client;
//     }

//     public void setClient(Client client) {
//         this.client = client;
//     }

//     public String getAccType() {
//         return accType;
//     }

//     public void setAccType(String accType) {
//         this.accType = accType;
//     }

//     protected void imprimirInfoBase() {
//         System.out.println(String.format("Cliente: %s", this.client.getName()));    
//         System.out.println(String.format("Agencia: %d", this.agencia));    
//         System.out.println(String.format("Número: %d", this.accNumber));    
//         System.out.println(String.format("Saldo: %.2f", this.balance));
//         System.out.println("::::::::::::::::::::::::::::::::::::::::::\n");
//     }
// }
