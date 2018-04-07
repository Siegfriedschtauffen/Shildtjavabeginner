package mnogopoto4noe_prgrmvnie;

// Применение методов wait() и notify() для имитации часов.
class TickTock{
    String state; // содержит сведенья о состоянии часов
    synchronized void tick(boolean running){
        if (!running){     // остановить часы
            state="ticked";
            notify();      // уведомить ожидающие потоки
            return;
        }
        System.out.print("Tick ");
        state = "ticked"; // установить текущее состояние после такта "тик"
        notify(); // Метод tick() уведомляет метод tock()
                  // о возможноости продолжить выполнение.
        try {
            while (!state.equals("tocked"))
                wait(); // Метод tick() ожидает завершения метода tock().
        }catch (InterruptedException e){
            System.out.println("Thread interrupted.");
        }
    }
    synchronized void tock(boolean running){
        if (!running){     // остановить часы
            state="tocked";
            notify();      // уведомить ожидающие потоки
            return;
        }
        System.out.println("Tock");
        state = "tocked"; // установить текущее состояние после такта "так"
        notify(); // Метод tock() уведомляет метод tick()
        // о возможноости продолжить выполнение.
        try {
            while (!state.equals("ticked"))
                wait(); // Метод tock() ожидает завершения метода tick().
        }catch (InterruptedException e){
            System.out.println("Thread interrupted.");
        }
    }
}
class MyThread9 implements Runnable{
    Thread thrd;
    TickTock ttob;

    // построить новый поток
    MyThread9(String name, TickTock tt){
        thrd = new Thread(this,name);
        ttob = tt;
        thrd.start(); // начать поток
    }
    // начать исполнение нового потока
    @Override
    public void run() {
        if (thrd.getName().compareTo("Tick")==0){
            for (int i = 0; i < 5; i++) ttob.tick(true);
            ttob.tick(false);
        }else {
            for (int i = 0; i < 5; i++) ttob.tock(true);
            ttob.tock(false);
        }
    }
}
public class ThreadCom {
    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyThread9 mt1 = new MyThread9("Tick",tt);
        MyThread9 mt2 = new MyThread9("Tock",tt);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted.");
        }
    }
}
