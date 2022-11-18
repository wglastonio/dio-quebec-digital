import java.util.Scanner;

public class RoboLimpeza {
    public static void main(String[] args) {
        String movimentos = new Scanner(System.in).nextLine();
 
        var x = 0;
        var y = 0;

        for (int i = 0; i < movimentos.length(); i++) {
            char ch = movimentos.charAt(i);
            if (ch == 'W' || ch == 'w') x++;
            if (ch == 'S' || ch == 's') x--;
            if (ch == 'D' || ch == 'd') y++;
            if (ch == 'A' || ch == 'a') y--;
        }

        if (x == 0 && y == 0) {
                System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}
