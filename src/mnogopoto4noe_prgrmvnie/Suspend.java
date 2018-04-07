package mnogopoto4noe_prgrmvnie;

// Присстановка, возобновление и останока потока.
class MyThread10 implements Runnable{
    Thread thrd;
    // Если эта переменная принимает логическое значение
    // true, исполнение потока приостанавливается.
    volatile boolean suspended;
    // Если эта переменная принимает логическое значение
    // true, исполнение потока прекращается.
    volatile boolean stopped;
    MyThread10 (String name){
        thrd = new Thread(this,name);
        suspended = false;
        stopped = false;
        thrd.start();
    }
    // Точка входа в поток.
    @Override
    public void run() {
        System.out.println(thrd.getName()+" starting.");
        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i+" ");
                if ((i%10==0)){
                    System.out.println();
                    Thread.sleep(250);
                }
                // Для проверки условия приостановки и остановки потока
                // используется следующий синхронизированный блок.
                synchronized (this){
                    while (suspended){
                        wait();
                    }
                    if (stopped)break;
                }
            }
        }catch (InterruptedException e){
            System.out.println(thrd.getName()+" interrupted.");
        }
        System.out.println(thrd.getName()+" exiting.");
    }
    // остановить поток
    synchronized void mystop(){
        stopped = true;
        // следующие операторы обеспечивают полную
        // остановку приостановленного потока.
        suspended = false;
        notify();
    }
    // приостановить поток
    synchronized void mysuspend(){
        suspended = true;
    }
    // возобновить поток
    synchronized void myresume(){
        suspended = false;
        notify();
    }
}
public class Suspend {
    public static void main(String[] args) {
        MyThread10 ob1 = new MyThread10("My Thread");
        try {
            Thread.sleep(1000); // позволить потоку ob1 начать исполнение
            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Stopping thread.");
            ob1.mystop();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }

        // ожидать завершения потока
        try {
            ob1.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
