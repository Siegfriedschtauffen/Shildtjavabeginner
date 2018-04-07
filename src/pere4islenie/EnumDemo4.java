package pere4islenie;

// Применение методов ordinal() и compareTo().

// Перечисление разных видов транспорта.
enum Transport4{
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

public class EnumDemo4 {
    public static void main(String[] args) {
        Transport4 tp, tp2, tp3;

        // получить все порядковые значения с помощью метода ordinal()
        System.out.println("Here are all Transport constants and their ordinal values: ");
        for (Transport4 t : Transport4.values())
            // Получение порядковых значений констант
            System.out.println(t+" "+t.ordinal());

        tp = Transport4.AIRPLANE;
        tp2 = Transport4.TRAIN;
        tp3 = Transport4.AIRPLANE;

        System.out.println();

        // продемонстрировать применение метода compareTo()
        // Сравнение порядковых значений констант.
        if (tp.compareTo(tp2)<0)
            System.out.println(tp+" comes before "+tp2);
        if (tp.compareTo(tp2)>0)
            System.out.println(tp2+" comes before "+tp);
        if (tp.compareTo(tp3)==0)
            System.out.println(tp+" equals "+tp3);
    }
}
