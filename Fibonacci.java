import java.util.Scanner;
class Fibonacci{
    public static void main(String []args){
          int a,b=0,i,j,arr[];
          Scanner s = new Scanner(System.in);
          System.out.println("Input a number");
           a = s.nextInt();
           arr=new int[a];
           arr[0]=0;
           arr[1]=1;
           for(i=2;i<a;i++){
            arr[i]=arr[i-1]+arr[i-2];
            
           }
           for(i=0;i<a;i++){
            
            System.out.println(arr[i]);
           }
    }
}
