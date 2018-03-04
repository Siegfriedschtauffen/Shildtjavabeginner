package breakandcontinue.breaks;
// Чтение вводимых данных до тех пор, пока не будет получена буква q.

import java.io.IOException;

public class Break2 {
    public static void main(String[] args) throws IOException {
        char ch;

        // "Бесконечный" цикл, завершаемый с помощью оператора break.
        for( ; ; ){
            ch = (char) System.in.read(); // Ввести символ с клавиатуры
            if(ch == 'q') break;
        }
        System.out.println("Ты нажал q!");
    }
}
