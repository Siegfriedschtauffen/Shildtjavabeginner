package mnogopoto4noe_prgrmvnie;

// Создание нескольких потоков.
class MyThread4 implements Runnable{
    Thread thrd;
    // построить новый поток
    MyThread4(String name){
        thrd = new Thread(this,name);
        thrd.start(); // начать поток
    }
    // начать исполнение нового потока
    public void run(){
        System.out.println(thrd.getName()+" starting.");
        try {
            for (int count = 0; count<10; count++){
                Thread.sleep(400);
                System.out.println("In "+thrd.getName()+", count is "+count);
            }
        }catch (InterruptedException e){
            System.out.println(thrd.getName()+" interrupted.");
        }
        System.out.println(thrd.getName()+" terminating.");
    }
}
public class MoreThreads {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        // Создание и запуск на исполнение трех потоков.
        MyThread5 mt1 = new MyThread5("Child #1");
        MyThread5 mt2 = new MyThread5("Child #2");
        MyThread5 mt3 = new MyThread5("Child #3");
        for (int i=0; i<50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}




