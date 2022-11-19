import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AccountFunctions {
    
    public static void saveValue(List<AccountList> accounts, int internalMenuOption) {
        System.out.print("\n:: Entre o número da conta: ");
        Scanner input = new Scanner(System.in);
        int account = input.nextInt();

        System.out.print(":: Entre o valor do depósito: ");
        input = new Scanner(System.in);
        Double value = input.nextDouble();

        Iterator<AccountList> it = accounts.iterator();
        while (it.hasNext()) {
            AccountList acc = it.next();
            if (acc.getAccNumber() == account) {
                acc.setBalance(acc.getBalance() + value);
                System.out.println("\n:: Depósito realizado\n" + acc);
            }
        }
    }

    public static void transferValue(List<AccountList> accounts, int internalMenuOption) {
        System.out.print("\n:: Entre o número da conta de origem: ");
        Scanner input = new Scanner(System.in);
        int accountOrig = input.nextInt();

        System.out.print(":: Entre o número da conta de destino: ");
        input = new Scanner(System.in);
        int accountDest = input.nextInt();

        if (accountOrig != accountDest) {
            System.out.print(":: Entre o valor da transferência: ");
            input = new Scanner(System.in);
            Double value = input.nextDouble();

            AccountList accO = new AccountList(0, null, 0, 0, null);
            AccountList accD = new AccountList(0, null, 0, 0, null);
            
            Iterator<AccountList> it = accounts.iterator();
            while (it.hasNext()) {
                AccountList acc = it.next();
                if (acc.getAccNumber() == accountOrig) {
                    accO = acc;
                    accO.setBalance(accO.getBalance() - value);
                }
                if (acc.getAccNumber() == accountDest) {
                    accD = acc;
                    accD.setBalance(accD.getBalance() + value);
                }
            }
            System.out.println("\n:: Transferência realizada!!\n" + accO + "\n" + accD);
        }
        else {
            System.out.println("\n:: Mesma conta de Origem e Destino!!\n:: Transferência não realizada!!");
        }
    }

    public static void retrieveValue(List<AccountList> accounts, int internalMenuOption) {
        System.out.print("\n:: Entre o número da conta: ");
        Scanner input = new Scanner(System.in);
        int account = input.nextInt();

        System.out.print(":: Entre o valor do saque: ");
        input = new Scanner(System.in);
        Double value = input.nextDouble();

        Iterator<AccountList> it = accounts.iterator();
        while (it.hasNext()) {
            AccountList acc = it.next();
            if (acc.getAccNumber() == account) {
                acc.setBalance(acc.getBalance() - value);
                System.out.println("\n:: Saque realizado\n" + acc);
            }
            else {
                System.out.println("\n:: Conta não existe!!");
            }
        }
    }
}
