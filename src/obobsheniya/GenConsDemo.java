package obobsheniya;

// Применение обобщенного коструктора.
class Summation{
    private int sum;
    // Обобщенный конструктор.
    <T extends Number> Summation(T arg){
        sum = 0;
        for (int i = 0; i <= arg.intValue(); i++)
            sum += i;
    }

    int getSum() {
        return sum;
    }
}
public class GenConsDemo {
    public static void main(String[] args) {
        Summation ob = new Summation(4.0);
        System.out.println("Summation of 4.0 is " + ob.getSum());
    }
}
