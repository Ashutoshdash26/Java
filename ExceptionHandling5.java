public class ExceptionHandling5 {
    public static void main(String []args){
        try{
            int a=10/0;
            System.out.println("he he");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("hi");
    }
}
