/*
    Пример для опробование 4.2.

    Демонстрация "сборки мусора" и метода finalize().
 */

class FDemo {
    int x;

    FDemo(int i){
        x = i;
    }
    // вызывается при утилизации объекта
    protected void finalize(){
        System.out.println("Finalizing " + x);
    }
    // формирает объект который тотчас уничтожается
    void generator (int i){
        FDemo o = new FDemo(i);
    }
}
public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);
        /*
            А теперь сформировать большое количество объектов.
            В какой-то момент должна сработать "сборка мусора".
            Примечание: количество формируемых объектов, возможно,
            придется увеличить, чтобы принудить "сборку мусора".
         */
        for (count=1; count<1000000; count++) ob.generator(count);
    }
}
