import java.util.Scanner;

class construct{
   int a,b,c,nn;

   construct(){
    this.a=10;
    this.b=20;
    this.c=30;
   }
   construct(int m){
      a=m;
   }
   construct(construct obj){
      nn=obj.a;
   }
}
public class constructor {
    int a,b,c; 
    Scanner S=new Scanner(System.in);
    constructor(){
        System.out.println("enter a number");
        a=S.nextInt();
        b=50;
        c=60;
    }
    public static void main(String[] args){
          Scanner ss =new Scanner(System.in);
          construct obj =new construct();
          constructor obj1=new constructor();
          System.out.println(obj.a+obj.b+obj.c);  
          System.out.println(obj1.a+" "+obj1.b+" "+obj1.c );   
          System.out.println("enter a number");

          int m=ss.nextInt();
          construct obj2=new construct(m);
          System.out.println(obj2.a+m);
          construct obj3=new construct(obj2);
          System.out.println(obj3.nn);

    }
}
