import java.util.Scanner;

// Class to capture the menu option
public class MenuOptionCapture {

    static String menuOptionCaptured() {
        Scanner input = new Scanner(System.in);
        String menuOptionCaptured = "";
        menuOptionCaptured = input.next();
        return menuOptionCaptured;
        
    }
}
