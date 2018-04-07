package obobsheniya;

// Применение метасимвольного аргумента.
class NumericFns2<T extends Number>{
    T num;
    // передать конструктору ссылку на числовой объект
    NumericFns2(T n){
        num = n;
    }
    // возвратить обратную величину
    double reciprocal(){
        return 1 / num.doubleValue();
    }
    // возвратить дробную часть
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
    // определить равенство абсолютных значений в двух объектах
    boolean absEqual(NumericFns2<?> ob){
        if (Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;
        return false;
    }
    // ...
}
// продемонстрировать применение метасимвольного аргумента
public class WildcardDemo {
    public static void main(String[] args) {
        NumericFns2<Integer> iOb = new NumericFns2<Integer>(6);
        NumericFns2<Double> dOb = new NumericFns2<Double>(-6.0);
        NumericFns2<Long> lOb = new NumericFns2<Long>(5L);

        System.out.println("Testing iOb and dOb.");
        // В этом вызове метода тип метасимвольного
        // аргумента совпадает с типом Double.
        if (iOb.absEqual(dOb))
            System.out.println("Absolute values are equal.");
        else System.out.println("Absolute values differ.");
        System.out.println();

        System.out.println("Testing iOb and lOb.");
        // А в этом вызове метода тип метасимвольного
        // аргумента совпадает с типом Long.
        if (iOb.absEqual(lOb))
            System.out.println("Absolute values are equal.");
        else System.out.println("Absolute values differ.");
    }
}
