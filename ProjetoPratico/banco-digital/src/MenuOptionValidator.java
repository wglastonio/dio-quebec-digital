public class MenuOptionValidator {
    
    static int menuOptionValidator(String menuOptionToValidate, int menuSize) {
            int menuOptionValidated = 0;
                
            // Check if menu option is numeric and in the menu range
            try {
                menuOptionValidated = Integer.parseInt(menuOptionToValidate);
                if (menuOptionValidated < 1 || menuOptionValidated > menuSize) {
                    printInvalidOption();
                    return -1;
                }
            } catch (NumberFormatException nfe) {
                printInvalidOption();
                return -1;
            }
    
            // Return menu option if it is valid
            return menuOptionValidated;
        }
    
        // Print invalid option
        private static void printInvalidOption() {
            System.out.println("\n!!! OPÇÃO IVÁLIDA !!!\n");
        }
}
