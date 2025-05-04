class boxclass {
    public static void main(String[] args) {
        doo a = new doo();
        int k = 10;
        System.out.println(a.a);
        int l = a.fun(2);
        System.out.println(l);
    }
}

class doo {

    int a = 10;

    int fun(int a) {
        int b = this.a;
        return b;
    }
}