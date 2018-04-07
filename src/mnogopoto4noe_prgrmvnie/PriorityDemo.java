package mnogopoto4noe_prgrmvnie;

// Демонстрация потоков с разными приоритетами.
class Priority implements Runnable{
    int count;
    Thread thrd;
    static boolean stop = false;
    static String currentName;

    /* Построение нового потока. Обратите внимание на то,
       что конструктор не запускает поток на исполнание. */
    Priority (String name){
        thrd = new Thread(this,name);
        count = 0;
        currentName = name;
    }
    // начать исполнение нового потока
    public void run(){
        System.out.println(thrd.getName()+" starting.");
        do {
            count++;
            if (currentName.compareTo(thrd.getName())!=0){
                currentName = thrd.getName();
                System.out.println("In "+currentName);
            }
        // Первый же поток, в котором достигнуто значение 10000000,
        // завершает остальные потоки.
        }while (stop == false && count<10000000);
        stop=true;
        System.out.println("\n"+thrd.getName()+" terminated.");
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        Priority mt1 = new Priority("High Priority");
        Priority mt2 = new Priority("Low Priority");

        // задать приоритеты
        // Поток mt1 получает более высокий приоритет, чем mt2.
        mt1.thrd.setPriority(Thread.NORM_PRIORITY+2);
        mt2.thrd.setPriority(Thread.NORM_PRIORITY-2);

        // запосутить потоки на исполнение
        mt1.thrd.start();
        mt2.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("\nHigh priority thread counted to "+mt1.count);
        System.out.println("Low priority thread counted to "+mt2.count);
    }
}
