import Mypack.String1;
//package mypack;
public class packagess {
    public static void main(String[] args) {
        b ob = new b();
        ob.show();
        //String1 obb = new String1();
        //int gam = odd.add(10, 20);
       // System.out.println(gam);
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