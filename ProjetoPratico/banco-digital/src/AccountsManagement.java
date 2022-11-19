import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AccountsManagement {

    final static String BANK = "Banco X";
    static List<AccountList> accounts = new ArrayList<>();
    public static void main(String[] args) {

        int internalMenuOption = -1;
        String menuOption = "";

        while (internalMenuOption == -1) {
            // Define menu size
            int menuSize = 6;
            // Menu de opções
            System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("::              " + BANK + "                 ::");
            System.out.println("::                                      ::");
            System.out.println("::  1 - Criar Conta                     ::");
            System.out.println("::  2 - Listar Todas as Contas          ::");
            System.out.println("::  3 - Efetuar Depósito                ::");
            System.out.println("::  4 - Efetuar Transferência           ::");
            System.out.println("::  5 - Efetuar Saque                   ::");
            System.out.println("::  6 - Sair                            ::");
            System.out.println("::                                      ::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("\nDigite a opção desejada: ");
            // Collect and check the menu option
            menuOption = MenuOptionCapture.menuOptionCaptured();
            internalMenuOption = MenuOptionValidator.menuOptionValidator(menuOption, menuSize);
            
            if (internalMenuOption == 1) {
                createAccount();
                internalMenuOption = -1;
            }
            else if (internalMenuOption == 2) {
                listAccounts();
                internalMenuOption = -1;
            }
            else if (internalMenuOption == 3) {
                AccountFunctions.saveValue(accounts, internalMenuOption);
                internalMenuOption = -1;
            }
            else if (internalMenuOption == 4) {
                AccountFunctions.transferValue(accounts, internalMenuOption);
                internalMenuOption = -1;
            }
            else if (internalMenuOption == 5) {
                AccountFunctions.retrieveValue(accounts, internalMenuOption);
                internalMenuOption = -1;
            }
        }
    }

    // List all actives accounts
    private static void listAccounts() {
        System.out.println("\n:: LISTA DE CONTAS ATIVAS " + "-- " + BANK);
        Iterator<AccountList> it = accounts.iterator();
        while (it.hasNext()) {
            AccountList acc = it.next();
            System.out.println(acc);
        }
    }

    // Create account
    private static void createAccount() {
        System.out.print("\n:: Entre com as informações a seguir para criar uma nova conta");
        System.out.print("\n:: Nome do cliente: ");
        Scanner input = new Scanner(System.in);
        String clientName = input.nextLine();
        Client client = new Client(clientName.toUpperCase());
        int internalMenuOption = -1;
        String menuOption = "";
        int menuSize = 2;
        while (internalMenuOption == -1) {
            System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
            System.out.println("::           TIPO DE CONTA              ::");
            System.out.println("::                                      ::");
            System.out.println("::  1 - Conta Corrente                  ::");
            System.out.println("::  2 - Conta Poupança                  ::");
            System.out.println("::                                      ::");
            System.out.println("::::::::::::::::::::::::::::::::::::::::::");
            System.out.print("\nDigite o tipo de conta: ");
        
            // Collect and check the menu option
            //menuOption = menuOptionCapture();
            menuOption = MenuOptionCapture.menuOptionCaptured();
            internalMenuOption = MenuOptionValidator.menuOptionValidator(menuOption, menuSize);
        }
        String accType = "";
        if (internalMenuOption == 1) { 
            accType = "Corrente";
        }
        else {
            accType = "Poupança";
        }
        System.out.print("\n:: Informe o saldo inicial: ");
        double accBalance = input.nextDouble();
    
        Integer branch = AccountList.getStdBranch();
        Integer accNumber = AccountList.getACC_SEQ_NUMBER();
        
        accounts.add(new AccountList(branch, accType, accNumber, accBalance, client.getName()));
    }
}
