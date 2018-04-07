package obobsheniya;

// В этой версии класса NumericFns аргументом типа,
// заменяющим параметр типа T, должен стать класс Number
// или производный от него подкласс, как показано ниже.
class NumericFns<T extends Number>{
    T num;
    // передать конструктору ссылку на числовой объект
    NumericFns(T n){
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
    // ...
}
// продемонстрировать класс NumericFns
public class BoundsDemo {
    public static void main(String[] args) {
        // Применение класса Integer вполне допустимо, так как он
        // является подклассом, производным от класса Number.
        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        System.out.println("Reciprocal of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());
        System.out.println();
        // Применение класа Double также допустимо.
        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocal of dOb is " + dOb.reciprocal());
        System.out.println("Fractional component of dOb is " + dOb.fraction());
        // Следующая строка кода не будет компилироваться, так как
        // класс String не является производным от класса Number.
      //  NumericFns<String> strOb = new NumericFns<String>("Error");
    }
}
