public class excptionHandlinG {
    public static void main ( String [] args ) {
         try {
            int[] arr={1,2,3,4,5};
            int q=1;
           // System.out.println(arr[q]);
        //checkAge (17) ;
        int age=9;
        if(q>=arr.length){
            throw new ArrayIndexOutOfBoundsException("not posible to acess");
        }
        else{
            System.out.println("inside index");
        }
        if ( age < 18) {
            throw new Exception ( " Age must be 18 or older ." ) ;
           
           }
            else
            {
            System . out . println ( " Age > 18 " ) ;
           }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch ( ArithmeticException e ) {
         System . out . println ( e . getMessage () ) ;
         }
         catch(Exception e){
            System.out.println(e.getMessage());
         }


         try {
            int data = 25 / 0; // This will throw ArithmeticException
            System.out.println(data);
        } catch (ArithmeticException e) { // Catch the correct exception
            System.out.println(e);
        } finally {
            System.out.println("finally block is always executed");
        }
         }
        //  static void checkAge ( int age ) {
        //  if ( age < 18) {
        //  throw new ArithmeticException ( " Age must be 18 or older ." ) ;
        // }
        //  else
        //  {
        //  System . out . println ( " Age > 18 " ) ;
        // }
        // }
}
