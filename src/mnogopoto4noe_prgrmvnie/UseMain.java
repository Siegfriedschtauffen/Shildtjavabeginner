package mnogopoto4noe_prgrmvnie;
/*
    Пример для опробования 11.2.

    Управление основным потоком.
 */
public class UseMain {
    public static void main(String[] args) {
        Thread thrd;
        // получить основной поток
        thrd = Thread.currentThread();
        // отобразить имя основного потока
        System.out.println("Main thread is called: "+thrd.getName());
        // отобразить приоритет основного потока
        System.out.println("Priority: "+thrd.getPriority());
        System.out.println();
        // установить имя и приоритет основного потока
        System.out.println("Setting name and priority.\n");
        thrd.setName("Thread #1");
        thrd.setPriority(Thread.NORM_PRIORITY+3);
        System.out.println("Main thread is called: "+thrd.getName());
        System.out.println("Priority is now: "+thrd.getPriority());
    }
}
