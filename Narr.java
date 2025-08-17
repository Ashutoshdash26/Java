import java.util.Scanner;
public class Narr {
           static String kv="kvvvvvvvvvvvv";

    public static void main(String [] args){
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the Size of Array ");
    //    int a=s.nextInt();
    //    int arr[]=new int[a];
    //    for(int i=0;i<arr.length;i++){
    //     System.out.println("Enter the " +i+"th ellement ");
    //     arr[i]=s.nextInt();
    //    }
    //    for(int i=0;i<arr.length;i++){
    //     System.err.print(arr[i]);
    //     //as
    //    }

    //    System.out.println("Enter character array Size");
    //    int ci=s.nextInt();
    //    int nu=s.nextInt();
    //    char a[][]=new char[ci][nu];
    //    for(int i=0;i<ci;i++){
    //     for(int j=0;j<nu;j++){
    //         a[i][j]=s.next().charAt(0);
    //     }
    //    }

    //     for(int i=0;i<ci;i++){
    //     for(int j=0;j<nu;j++){
    //         System.out.print(a[i][j]);
    //     }
    //    }


    //    System.out.println("Enter the sige of string ");
    //    int si=s.nextInt();
    //    int ci=s.nextInt();
    //    String ss[][]=new String[si][ci];
    //    for(int i=0;i<si;i++){
    //     for(int j=0;j<ci;j++){
    //         ss[i][j]=s.nextLine();
    //     }
    //    }

    //    for(int i=0;i<si;i++){
    //     for(int j=0;j<ci;j++){
    //         System.out.println(ss[i][j]+" alive" );
    //     }
    //    }
       th h=new th();
       int km=h.fun(9);
       System.out.println(km);
       h.rub();
       h.gg();
       System.out.println(kv +"  m");
    }
}
class th{
    int fun(int m){
        if(m==0||m==1){
            return 1;
        }
        return m*fun(m-1);
    }
    void rub(){
        int a=10;
        System.out.println(a);
    }
    void gg(){
        System.out.println(Narr.kv);
    }
}