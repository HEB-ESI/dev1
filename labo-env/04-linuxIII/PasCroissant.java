
public class PasCroissant {

    public static void main(String[] args) {
        int curValue = 1;
        for (int step = 1; step <= 1000; step++) {
            System.out.println(curValue);
            curValue = curValue + step;
        }
    }
}
