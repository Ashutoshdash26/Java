package Mypack;
public class String1 {
    public static void main(String[] args) {
        String sum = "totslsum";
        int i = 10;
        call c = new call();
        c.fun(sum, i);
        System.out.println(c);
        String st = new String("Hello");
        System.out.println(st);
        System.out.println(st.charAt(4));
        System.out.println(st.length());
    }

    public int add(int i, int k) {
        return i + k;
    }
}

class call {
    String asu;
    int k;

    void fun(String a, int b) {
        asu = a;
        k = b;
    }

    public String toString() {
        return "king are " + asu + " " + k;
    }
}