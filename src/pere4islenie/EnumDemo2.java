package pere4islenie;
// Применение встроенных в перечисление методов.

// Перечисление разных видов транспорта.
enum Transport2{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Transport2 tp;
        System.out.println("Here are all Transport constants");
        // воспользоваться методом values()
        // Получение массива констант типа Transport.
        Transport2 allTransports[]=Transport2.values();
        for (Transport2 t : allTransports)
            System.out.println(t);
        System.out.println();
        // воспользоваться методом valueOf()
        // Получение константы под названием AIRPLANE.
        tp = Transport2.valueOf("AIRPLANE");
        System.out.println("tp contains "+tp);
    }
}
