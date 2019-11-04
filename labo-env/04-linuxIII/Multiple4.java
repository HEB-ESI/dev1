
import java.util.Scanner;

public class Multiple4 {

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int nb;
        while (kbd.hasNext()) {
            if (kbd.hasNextInt()) {
                nb = kbd.nextInt();
                if (nb % 4 == 0) {
                    System.out.println(nb);
                }
            } else {
                kbd.next();
            }
        }
    }
}
