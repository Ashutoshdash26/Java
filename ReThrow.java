public class ReThrow {
    public void fun(int a,int b) throws Exception{
        try{
            if(a<19||b>75){
                System.out.println("Not Elegible");
                throw new Exception("it is not maching");
            }else{
                System.out.println("eligable");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
           throw new IllegalAccessException("Exp"+e);
           
        }
    }
    public static void main(String[] args) {
        try{

        
        ReThrow obj=new ReThrow();
        obj.fun(20,72);
        obj.fun(21,44);
        obj.fun(34,65);
        obj.fun(9,10 );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("hi");
    }
}