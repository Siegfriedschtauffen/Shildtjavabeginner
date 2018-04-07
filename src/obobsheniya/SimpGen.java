package obobsheniya;

// Простой обобщенный класс с двумя параметрами типа T и V.
class TwoGen<T, V> { // Применение двух параметров типа.
    T ob1;
    V ob2;

    // передать коструктору класса ссылки на объекты типов T и V
    TwoGen(T o1, V o2){
        ob1 = o1;
        ob2 = o2;
    }

    // отобразить типа T и V
    void showTypes(){
        System.out.println("Type of T is " + ob1.getClass().getName());
        System.out.println("Type of V is " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

// продемонстрировать класс TwoGen
public class SimpGen {
    public static void main(String[] args) {
        // Здесь в качестве параметра типа T передается тип
        // Integer, а в качестве параметра типа V - тип String.
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88,"Generics");

        // отобразить конкретные типы
        tgObj.showTypes();

        // получить и отобразить отдельные значения
        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
