package esi.dev1.td6;

public class Maximum {

    static int max2(int a, int b) {
        int max = a;
        if(a < b) {
            max = b;
        }
        return max;
    }
    
    static int max3(int a, int b, int c) {
        int max = max2(a, b);
        max = max2(max, c);
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(max2(10, 6));
        System.out.println(max3(10, 6, 19));
    }
}
