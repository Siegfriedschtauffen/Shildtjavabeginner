package breakandcontinue.breaks;
// Применение оператора break для выхода из цикла.

public class BreakDemo {
    public static void main(String[] args) {
        int num = 100;

        // выполнять цикл до тех пор, пока квадрат значения
        // переменной i меньше переменной num
        for(int i=0; i<num; i++){
            if(i*i >= num)break; // прекратить цикл, если i*i >= 100
            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}
