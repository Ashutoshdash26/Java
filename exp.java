import java.util.Scanner;
public class exp {
    public static void main(String [] args){
        int a=21;
        boolean boo=false;
        System.out.println("Ashutosh Dash  " + a +"  "+boo);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<arr.length;i++){
            System.out.printf("Enter the %d th element %n",i+1);
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
