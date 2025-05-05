import mypack.str87;

//package mypack;
public class packagess {
    public static void main(String[] args) {
        b ob = new b();
        ob.show();
        // String1 obb = new String1();
        // int gam = odd.add(10, 20);
        // System.out.println(gam);
        str87 obb = new str87();
        int lad=obb.add(10, 20);
        System.out.println(lad);
    }
}

interface Innerpackagess {
    int ok = 1;

    void show();
}

class b implements Innerpackagess {
    int ok = 4;

    public void show() {
        ok = 2;
        System.out.println(ok);
    }
}