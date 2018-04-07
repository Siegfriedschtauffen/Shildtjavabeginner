package pere4islenie;
// Применение конструктора, переменной экземпляра и
// метода в перечислении.
enum Transport3{
    // Обратите внимание на инициализирующие значения констант
    CAR(65),TRUCK(55),AIRPLANE(600),TRAIN(70),BOAT(22);
    // Объявление переменной экземпляра.
    private int speed; // обычная скорость каждого транспортного средства
    // Объявление конструктора.
    Transport3(int a){speed=a;}
    // Определение метода.
    int getSpeed(){return speed;}
}
public class EnumDemo3 {
    public static void main(String[] args) {
        Transport3 tp;
        // отобразить скорость самолета
        // Скорость определяется с помощью метода getSpeed().
        System.out.println("Typical speed for airplane is "+
                Transport3.AIRPLANE.getSpeed()+" miles per hour.\n");
        // отобразить все виды транспорта и скорости их передвижения
        System.out.println("All Transport speeds: ");
        for (Transport3 t : Transport3.values()) {
            System.out.println(t+" typical speed is "+t.getSpeed()+" miles per hour.");
        }
    }
}
