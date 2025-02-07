import java.util.Scanner;
public class pyramid {
    public static void main (String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the box");
        int a = s.nextInt();
        int j=0;
        char ch='a';
        for(int i=0;i<a;i++){
            ch='a';
            for( j=0;j<a-i;j++){
                System.out.print(ch+" " );
                ch++;
            } 
            for(int k=0;k<(i+i)*2;k++){
                System.out.print(" ");
            }
            for( j=0;j<a-i;j++){
                
                 ch--;
                 System.out.print(ch +" " );
             } 
            System.out.println(" ");
        }
    }
}
