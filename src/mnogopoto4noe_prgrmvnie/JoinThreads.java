package mnogopoto4noe_prgrmvnie;

// Применение метода join().
class MyThread6 implements Runnable{
    Thread thrd;
    // построить новый поток
    MyThread6(String name){
        thrd = new Thread(this,name);
        thrd.start(); // начать поток
    }
    // начать исполнение нового потока.
    public void run(){
        System.out.println(thrd.getName()+" starting.");
        try {
            for (int count = 0; count<10;count++){
                Thread.sleep(400);
                System.out.println("In "+thrd.getName()+", count is "+count);
            }
        }catch (InterruptedException e){
            System.out.println(thrd.getName()+" interrupted.");
        }
        System.out.println(thrd.getName()+" terminating.");
    }
}
public class JoinThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");

        MyThread6 mt1 = new MyThread6("Child #1");
        MyThread6 mt2 = new MyThread6("Child #2");
        MyThread6 mt3 = new MyThread6("Child #3");

        try {
            // Ожидание до тех пор, пока указанный метод не завершится.
            mt1.thrd.join();
            System.out.println("Child #1 joined.");
            mt2.thrd.join();
            System.out.println("Child #2 joined.");
            mt3.thrd.join();
            System.out.println("Child #3 joined.");
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}


