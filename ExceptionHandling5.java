public class ExceptionHandling5 {
    public static void main(String []args){
        try{
            int a=10/1;
            System.out.println("the ");

            try {
                int c[]={1};
                int b=args.length;
                System.out.println(b+ c[42]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }catch(ArithmeticException e){

            System.out.println("devide by zero");
            System.out.println(e.getMessage());

        }
        System.out.println("hi");
    }
}
