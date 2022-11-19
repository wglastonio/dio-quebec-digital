package Drafts;
// import java.util.Scanner;

// public class MenuOpcoes {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);
//         int internalMenuOption = -1;
//         String menuOption = "";

//         while (true) {        
//             while (internalMenuOption == -1) {
//                 // Define menu size
//                 int menuSize = 3;

//                 // Menu de opções
//                 System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
//                 System.out.println("::           CONTA BANCÁRIA             ::");
//                 System.out.println("::  1 - Criar Conta                     ::");
//                 System.out.println("::  2 - Listar Todas as Contas          ::");
//                 System.out.println("::  3 - Sair                            ::");
//                 System.out.println("::::::::::::::::::::::::::::::::::::::::::");
//                 System.out.print("\nDigite a opção desejada: ");

//                 //Captura e verifica opção digitada
//                 menuOption = menuOptionCapture();
//                 internalMenuOption = menuOptionValidation(menuOption, menuSize);
//             }

            
//             //Opção Criar Conta
//             if (internalMenuOption == 1) {
//                 System.out.print("\n:: Entre com as informações a seguir para criar uma nova conta ::");
//                 System.out.print("\n:: Nome do cliente: ");
//                 String clientName = input.nextLine();
//                 Client client = new Client();
//                 client.setName(clientName.toUpperCase());

//                 internalMenuOption = -1;
//                 int menuSize = 2;
//                 while (internalMenuOption == -1) {
//                     System.out.println("\n::::::::::::::::::::::::::::::::::::::::::");
//                     System.out.println("::           TIPO DE CONTA              ::");
//                     System.out.println("::  1 - Conta Corrente                  ::");
//                     System.out.println("::  2 - Conta Poupança                  ::");
//                     System.out.println("::::::::::::::::::::::::::::::::::::::::::");
//                     System.out.print("\nDigite a opção desejada: ");
                
//                     //Captura e verifica opção digitada
//                     menuOption = menuOptionCapture();
//                     internalMenuOption = menuOptionValidation(menuOption, menuSize);
//                 }

//                 System.out.print("\n:: Informe o saldo inicial: ");
//                 double accBalance = input.nextDouble();

//                 if (internalMenuOption == 1) {
//                     Conta regularAccount = new ContaCorrente(client, internalMenuOption, accBalance);
//                     regularAccount.imprimirExtrato();
//                 }
//                 else {
//                     Conta saveAccount = new ContaPoupanca(client);
//                     saveAccount.imprimirExtrato();
//                 }
//             }
//         }

//             // //Listar todas as contas
//             // if (opcaoMenu == 2 ) {
//             //     System.out.println("\nListar todas as contas!!");

//             //     opcaoMenu = 0;
//             // }

//             // if (opcaoMenu == 0) {
//             //     System.out.println("\nTermina o programa!!");
//             //     break;
//             // }
 
//     }

//     // Menu option capture
//     public static String menuOptionCapture () {
//         Scanner input = new Scanner(System.in);
//         String menuOptionCaptured = "";
//         menuOptionCaptured = input.next();
//         return menuOptionCaptured;
//     }

//     // Menu option validation
//     private static int menuOptionValidation(String menuOptionToValidate, int menuSize) {
//         int menuOptionValidated = 0;        
// 		// Check if menu option is numeric and in the menu range
// 		try {
// 			menuOptionValidated = Integer.parseInt(menuOptionToValidate);
//             if (menuOptionValidated < 1 || menuOptionValidated > menuSize) {
//                 printInvalidOption();
//                 return -1;
//             }
// 	    } catch (NumberFormatException nfe) {
//             printInvalidOption();
// 	        return -1;
// 	    }

//         // Return menu option if it is valid
// 		return menuOptionValidated;
//     }

//     // Print invalid option
//     private static void printInvalidOption() {
//         System.out.println("\n!!! OPÇÃO IVÁLIDA !!!\n");
//     }
// }
