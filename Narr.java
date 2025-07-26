import java.util.Scanner;
public class Narr {
    public static void main(String [] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Size of Array ");
       int a=s.nextInt();
       int arr[]=new int[a];
       for(int i=0;i<arr.length;i++){
        System.out.println("Enter the " +i+"th ellement ");
        arr[i]=s.nextInt();
       }
       for(int i=0;i<arr.length;i++){
        System.err.print(arr[i]);
        //as
       }
    }
}
