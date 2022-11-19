public class AccountList {
    private static final int STD_BRANCH = 8888;
    private static int ACC_SEQ_NUMBER = 1111;

    private int branch;
    private String accType;
    private int accNumber;
    private double balance;
    private String clientName;

    public AccountList(int branch, String accType, int accNumber, double balance, String clientName) {
        this.branch = branch;
        this.accType = accType;
        this.accNumber = accNumber;
        this.balance = balance;
        this.clientName = clientName;
    }

    public static int getStdBranch() {
        return STD_BRANCH;
    }

    public static int getACC_SEQ_NUMBER() {
        return ACC_SEQ_NUMBER++;
    }

    public int getBranch() {
        return branch;
    }

    public String getAccType() {
        return accType;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return ":: Agência: " + branch + "  |" + "  Tipo de Conta: " + accType + "  |"
        + "  Número da conta: " + accNumber + "  |" + "  Saldo: " + balance + "  |"
        + "  Nome do cliente: " + clientName;
    }
}
