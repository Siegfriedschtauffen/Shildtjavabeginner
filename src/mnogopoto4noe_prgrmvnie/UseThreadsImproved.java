package mnogopoto4noe_prgrmvnie;

// Видоизменение класса MyThread.
class MyThread2 implements Runnable{
    Thread thrd; // В этой переменной хранится ссылка на поток.
    // построить новый поток
    MyThread2(String name){
        thrd = new Thread(this,name); // Поток именуется при его создании.
        thrd.start(); // Начало исполнения потока.
    }
    // начать исполнение нового потока
    public void run() {
        System.out.println(thrd.getName()+" starting.");
        try {
            for (int count = 0; count<10; count++){
                Thread.sleep(400);
                System.out.println("in "+thrd.getName()+", count is "+count);
            }
        }catch (InterruptedException e){
            System.out.println(thrd.getName()+" interrupted.");
        }
        System.out.println(thrd.getName()+" terminating.");
    }
}
public class UseThreadsImproved {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        // Теперь поток начинается при его создании.
        MyThread2 mt = new MyThread2("Child #1");
        for (int i=0;i<50;i++){
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
