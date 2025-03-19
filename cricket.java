import java.util.Scanner;
class cric{
    int totalrun,century ,avragerun;
    String name;
    cric(String name, int totalrun, int century, int averagerun) {
        this.name = name;
        this.totalrun = totalrun;
        this.century = century;
        this.avragerun= averagerun;
    }
}
public class cricket {
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         System.out.println("Enter the number of player : ");
         int a=s.nextInt();
         cric[] arr = new cric[a];
         for(int i=0;i<a;i++){
            System.out.println("Enter the name ");
            String name=s.nextLine();

            System.out.println("Enter the totalrun ");
            int totalrun=s.nextInt();

            System.out.println("Enter the number of century ");
            int century=s.nextInt();

            System.out.println("Enter the averege run ");
            int avragerun=s.nextInt();
            arr[i]=new cric(name,totalrun,century,avragerun);
            System.out.println();
         }
    }
}
