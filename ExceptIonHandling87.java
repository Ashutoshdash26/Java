
public class ExceptIonHandling87 extends Exception {
    public ExceptIonHandling87(String message) {
        super(message);
    }
    public static void main(String[] args){
     int a=17;
     try {
        if(a>18){
            System.out.println("no dude too much age this is for small children ");
        }
        else{
            System.out.println("age taken");
        }
     } catch (Exception e) {
        // TODO: handle exception
         System.out.println(e.getMessage());
     }
     try {
        int q=a/0;
     } catch (ArithmeticException e) {
        System.err.println("not posible");
        // TODO: handle exception
     }
     finally{
        System.err.println("run all the time");
     }
     try {
        int i=10/0;

     } catch (Exception e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
     }



     try {
         String ms="ashutosh";
        int[] numbers = {1, 2, 3};
        int result = 10 / 0; // This will cause ArithmeticException
        System.out.println(numbers[5]); // This would cause ArrayIndexOutOfBoundsException
        System.out.println(ms.charAt(10));  

    } catch (ArithmeticException e) {
        System.out.println("Caught ArithmeticException: " + e.getMessage());
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Caught Exception: " + e.getMessage());
    }

   
    try {
        int number=-3;
        if(number<0){
            throw new ExceptIonHandling87("negative");
        }
        else{
            System.out.println("ok");
        }
    } catch (ExceptIonHandling87 e) {
        // TODO: handle exception
        System.out.println(e.getMessage());
    }
     
    }
    
}
