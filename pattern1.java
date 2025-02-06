import java.util.Scanner;
public class pattern1 {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the box");
        int a = s.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a-i;j++){
                System.out.print("* ");
            }  
            System.out.println(" ");
        }
    }
}