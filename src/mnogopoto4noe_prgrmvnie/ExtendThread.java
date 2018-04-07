package mnogopoto4noe_prgrmvnie;
/*
    Пример для опробования 11.1.

    Расширение класса Thread.
 */
class MyThread3 extends Thread{
    // построить новый поток
    MyThread3(String name){
        super(name); // присвоить потоку имя
        start(); // начать поток
    }
    // начать исполнение нового потока
    public void run() {
        System.out.println(getName()+" starting.");
        try {
            for (int count = 0; count<10; count++){
                Thread.sleep(400);
                System.out.println("in "+getName()+", count is "+count);
            }
        }catch (InterruptedException e){
            System.out.println(getName()+" interrupted.");
        }
        System.out.println(getName()+" terminating.");
    }
}
public class ExtendThread {
    public static void main(String[] args) {
        System.out.println("Main thread starting.");
        // Теперь поток начинается при его создании.
        MyThread3 mt = new MyThread3("Child #1");
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
