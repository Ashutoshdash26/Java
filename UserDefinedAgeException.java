import java.util.*;
class ageException extends Exception{
    ageException(String a){
          super(a);
    }
}


class cException extends Exception{
    int b;
    cException(int a){
        b=a;
    }
    public String toString(){
        return "this is Exception "+ b;
    }
}
public class UserDefinedAgeException {
    public static void main(String[] args) {
        Scanner sm=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sm.nextInt();
        try {
            if(a<18){
                throw new ageException("Your age is not enough");
            }
            System.out.println("first");
        } catch (ageException e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }


        try{
            if(a>18){
                throw new cException(a);
            }
            System.out.println("second");
        }catch(cException e){
              System.out.println(e);
        }
    }
    
    
}
