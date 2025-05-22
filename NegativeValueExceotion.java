import java.util.*;
public class NegativeValueExceotion extends Exception {
    NegativeValueExceotion(String s){
        super(s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=sc.nextInt();
        try {
            if(a<0){
                throw new NegativeValueExceotion("the value shold be positive ");
            }
            System.out.println("positive");
        } catch (NegativeValueExceotion e) {
            
            System.out.println(e.getMessage());
        }

        try {
            int q=10/0;
        } finally{
            System.out.println("alwayse execute");
        }
        System.out.println("test");
    }
}
