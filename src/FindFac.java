
/*
    Использовать вложенные циклы для выявления
    множителей чисел от 2 до 100.
 */

public class FindFac {
    public static void main(String[] args) {

        for (int i=2; i<=100; i++) {
            System.out.print("Factors of " + i + ": ");
            for (int j=2; j<i; j++) {
                if ((i%j) == 0) System.out.print(j + " ");
                if (j==10)break;
            }

            System.out.println();
        }
    }
}
