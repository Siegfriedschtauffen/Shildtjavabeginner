package mnogopoto4noe_prgrmvnie;

// Создание нескольких потоков.
class MyThread5 implements Runnable{
    Thread thrd;
    // построить новый поток
    MyThread5(String name){
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
// Применение метода isAlive().
public class MoreThreads2 {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        // Создание и запуск на исполнение трех потоков.
        MyThread5 mt1 = new MyThread5("Child #1");
        MyThread5 mt2 = new MyThread5("Child #2");
        MyThread5 mt3 = new MyThread5("Child #3");
        do {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Main thread interrupted.");
            }
        // Ожидание завершения потоков.
        }while (mt1.thrd.isAlive() ||
                mt2.thrd.isAlive() ||
                mt3.thrd.isAlive());
        System.out.println("Main thread ending.");
    }
}

