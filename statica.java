public class statica {
    public static void main(String[] args) {
        x obj = new x();
        // x.show();
        obj.show();
        x.test ob = new x.test();
        ob.show();
        x.so i = new x().new so();
        i.show();
        // x.test=obj.new test();
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

    static class test {
        void show() {
            System.out.println("good day");
        }
    }

    class so {
        void show() {
            System.out.println("good ay");
        }
    }
}