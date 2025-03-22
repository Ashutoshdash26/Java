import java.util.Scanner;
public class arrayadd {
    public static void main(String[] args){
        System.out.println("Enter the Size of the array = ");
        Scanner ss=new Scanner(System.in);
        int s=ss.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=ss.nextInt();
        }
        for(int i=0;i<s;i++){
            System.out.println(arr[i]);
        }
    }
}
