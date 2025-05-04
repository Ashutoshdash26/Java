public class statica {
    public static void main(String[] args) {
        x obj = new x();
        // x.show();
        obj.show();
    }
}

class x {
    static int a = 10;
    static int b;
    static {
        b = a * 10;
        System.out.println(b);
    }

    // static void show() {
    // System.out.println(a + "" + b);
    // }

    void show() {
        System.out.println(a + "" + b);
    }
}