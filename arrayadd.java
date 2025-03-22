import java.util.Scanner;
public class arrayadd {
    public static void main(String[] args){
        System.out.println("Enter the Size of the array = ");
        Scanner ss=new Scanner(System.in);
        int s=ss.nextInt();
        int arr[]=new int[s];
        System.out.println("Enter the elements ")
        for(int i=0;i<s;i++){
            arr[i]=ss.nextInt();
        }
        for(int i=0;i<s;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter the index you want to delete ");
        int km=ss.nextInt();

    }
}
