class boxclass {
    public static void main(String[] args) {
        doo a = new doo();
        int k = 10;
        System.out.println(a.a);
        int l = a.fun(2);
        System.out.println(l);
        dll d = new dll();

        System.out.println(d.fun());
        System.out.println(d.a);
        System.out.println(d.the);
        System.out.println(d.king);
        System.out.println(a.fun());
    }
}

class doo {
    public int the = 3;
    private int mos = 4;
    protected int king = 5;
    int a = 10;

    int fun() {

        return mos;
    }

    int fun(int a) {
        int b = this.a;
        return mos;
    }
}

class dll extends doo {
    // int fun() {
    // return a;
    // }
    // int fun() {
    // return the;
    // }
    int fun() {
        return king;
    }
}