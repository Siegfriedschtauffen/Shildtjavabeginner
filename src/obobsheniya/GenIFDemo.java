package obobsheniya;

// Пример обобщенного интерфейса.

// В этом интерфейсе подразумевается, что реализующий
// его класс содержит одно или несколько значений.
interface Containment<T> { // обобщенный интерфейс
    // Метод contains() проверяет, содержится ли
    // некоторый элемент в объекте класса,
    // реализующего интерфейс Containment.
    boolean contains(T o);
}
// реализовать интерфейс Containment с помощью массива,
// предназначенного для хранения значений.
// Любой класс, реализующий обобщенный интерфейс,
// так же должен быть обобщенным.
class MyClass<T> implements Containment<T>{
    T[] arrayRef;
    MyClass(T[] o){
        arrayRef = o;
    }
    // реализовать метод contains()
    public boolean contains(T o){
        for (T x : arrayRef)
            if (x.equals(o)) return true;
        return false;
    }
}
public class GenIFDemo {
    public static void main(String[] args) {
        Integer x[] = { 1,2,3 };
        MyClass<Integer> ob = new MyClass<Integer>(x);
        if (ob.contains(2)) System.out.println("2 is in ob");
        else System.out.println("2 is NOT in ob");
        if (ob.contains(5)) System.out.println("5 is in ob");
        else System.out.println("5 is NOT in ob");
        // Следующие строки кода недоступны, так как объект ob
        // является вариантом реализации интерфейса Containment для
        // типа Integer, а значение 9.25 относится к типу Double.
//        if (ob.contains(9.25)) // Недопустимо!
//            System.out.println("9.25 is in ob");
    }
}
