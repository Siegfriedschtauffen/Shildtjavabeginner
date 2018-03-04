package massivi;

// Демонстрация одномерного массива.

public class ArrayDemo {
    public static void main(String[] args) {
        int sample[] = new int[10];  // Поумполчанию значения всех элементов данного массива равны 0
        int i;

        // Массивы индексируются с нуля, как показано ниже.
        for (i=0; i<10; i=i+1) sample[i] = i; // присваивается значение каждому элементу массива

        // все элементы массива выводятся на экран
        for (i=0; i<10; i=i+1) System.out.println("This is sample["+i+"]: "+sample[i]);
    }
}
