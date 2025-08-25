import java.util.Scanner;
public class new78 {
    public static void main(String[] args) {
        System.out.println("now");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int a=sc.nextInt();
        System.out.println("The Size of the array is : " +a);
        int ar[]=new int[a];
        System.out.print("Enter "+ a +" number of element in the array : ");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        for(int i=0;i<ar.length;i++){
            //ar[i]=sc.nextInt();
            System.out.print("The element are : ");
            System.out.println(ar[i]);
        }
    }
}
