public class ExceptionHandling5 {
    public static int count(){
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        }finally{
            System.out.println("function final");
        }
    }
    public static void main(String []args){
        try{
            int a=10/1;
            System.out.println("the ");

            if(a<18){
                throw new Exception("less than 18");
            }

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
        catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("HELLO WORLD");
        }
        System.out.println("hi");

        try {
            int kir=10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("handle ");
        }

        System.out.println("gg");
        ExceptionHandling5 on=new ExceptionHandling5();
        on.count();
    }
}
