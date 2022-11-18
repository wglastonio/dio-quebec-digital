import java.util.*;

public class ReduzAZero {
    public static void main(String[] args) {
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0) {
           
            if (num % 2 == 0) {
                num /= 2;
                step++;
            } else {
                num--;
                step++;
            }
        }
        System.out.println(step);
    }
}
