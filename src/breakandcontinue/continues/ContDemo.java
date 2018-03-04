package breakandcontinue.continues;
// Применение оператора continue.

public class ContDemo {
    public static void main(String[] args) {
        int i;

        // вывести четные числа в пределах от 0 до 100
        for (i=0; i<=100; i++) {
            if ((i%2) != 0) continue; // завершить шаг итерации цикла
            System.out.println(i);
        }
    }
}
