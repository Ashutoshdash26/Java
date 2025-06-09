public class CurrentThread {
    public static void main(String[] args){
        Thread t= Thread.currentThread();
        System.out.println("Current Thread : "+t);
        t.setName("My Thread");
        System.out.println("Current Thread : "+t);
        for(int i=5;i>0;i--){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main Thread Interrupted ");
                // TODO: handle exception
            }
        }
    }
}
