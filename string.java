import java.util.Scanner;

public class string {
    public static void main(String[] args){
        Scanner ss= new Scanner(System.in);
        String str= "Hello World" ;
        System.out.println(str);
        String str1;
        str1=ss.nextLine();
        System.out.println(str1+" "+str.charAt(3));
        String str2=new String();
        str2 = ss.nextLine();
        System.out.println(str2);
        char c[]={'a','b','c','d','e'};
        String S=new String(c);
        System.out.println(S);
        String sam = new String(str);
        System.out.println(sam);
    }
}

