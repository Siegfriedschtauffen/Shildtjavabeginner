package pere4islenie;
// Пример для опробования 12.1.

// Иммитация автоматизированного светофора с помощью
// перечисления, описывающего перключаемые цвета светофора.

// Перечисление, представляющее состояние светофора.
enum TrafficLightColor{
    RED, GREEN, YELLOW
}
// Иммитация атоматизированного светофора.
class TrafficLightSimulator implements Runnable{
    private Thread thrd; // Поток для иммитации светофора
    private TrafficLightColor tlc; // Текущий цвет светофора
    boolean stop = false; // Остановка иммитации, если истинно
    boolean changed = false; // Переключение светофора, если истинно
    TrafficLightSimulator(TrafficLightColor init){
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }
    TrafficLightSimulator(){
        tlc = TrafficLightColor.RED;
        thrd = new Thread(this);
        thrd.start();
    }
    // Запуск иммитации автоматизированного светофора.
    @Override
    public void run() {
        while (!stop){
            try {
                switch (tlc){
                    case GREEN:
                        Thread.sleep(10000); // Зеленый на 10 секунд
                        break;
                    case YELLOW:
                        Thread.sleep(2000); // Желтый на 2 секунды
                        break;
                    case RED:
                        Thread.sleep(12000); // Красный на 12 секунд
                        break;
                }
            }catch (InterruptedException e){
                System.out.println(e);
            }
            changeColor();
        }
    }
    // Переключение цвета светофора.
    synchronized void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }
        changed = true;
        notify(); // уведомить о переключении цвета светофора
    }
    // Ожидание перелючения цвета светофора.
    synchronized void waitForChange(){
        try {
            while (!changed) // ожидать переключение цвета светофора
                wait();
            changed=false;
        } catch (InterruptedException e){
            System.out.println(e);
        }
    }
    // Возврат текущего цвета.
    TrafficLightColor getColor(){
        return tlc;
    }
    // Прекращение иммитации светофора.
    void cancel(){
        stop = true;
    }
}
public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
