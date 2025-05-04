public class functionoverloading {
    public static void main(String[] args) {
        fun ab = new fun();

        System.out.println(ab.funny());
        System.out.println(ab.funny(7));
        System.out.println(ab.funny(5));
    }
}

class fun {
    int a = 6;

    fun() {
        System.out.println("5");
    }

    int funny() {
        System.out.println("5" + "game");
        return 10;
    }

    float funny(float s) {
        a = 5;
        float k = 10.5f + a;
        return k;
    }

    int funny(int a) {
        if (a == 1) {
            return 1;
        } else {
            return (a * funny(a - 1));
        }
    }
}
