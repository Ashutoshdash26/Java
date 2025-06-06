public class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
        }
    }
    
    public static void main(String[] args) {
        MyThread t1 = new MyThread();  // thread object
        t1.start();  // starts the thread, calls run() internally
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread 1 : " + i);
        }


        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);  // wrap it in Thread
        t2.start();  // start the thread
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread 2 : " + i);
        }
    }
}
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable running: " + i);
        }
    }
    
    // public static void main(String[] args) {
    //     MyRunnable r1 = new MyRunnable();
    //     Thread t1 = new Thread(r1);  // wrap it in Thread
    //     t1.start();  // start the thread
        
    //     for (int i = 1; i <= 5; i++) {
    //         System.out.println("Main thread: " + i);
    //     }
    // }
}

