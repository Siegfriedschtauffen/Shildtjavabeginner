package foreach;

import java.util.Scanner;
// Видоизмененная система поиска
// Поиск в массиве с использованием разновидности for-each цикла for.
public class Search {
    public static void main(String[] args){
        int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
        boolean found = false;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите цифру: ");
            int val = sc.nextInt();
            int i=0;

            // использовать разновидность for-each цикла for
            // для поиска значений переменной val в массиве nums
            for (int x : nums) {
                if (x == val) {
                    found = true;
                    break;
                }
                i++;
            }
            if (found) {
                System.out.println("Значение найдено в num[" + i + "] ^^ Ура!");
            } else System.out.println("Значение не найдено :(");
        }while (!found);
    }
}
