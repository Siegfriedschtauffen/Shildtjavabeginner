package isklu4eniya;

// Применение блока finally.
class UseFinally {
    public static void genException(int what) {
        int t;
        int nums[]=new int[2];
        System.out.println("Receiving "+ what);
        try {
            switch (what){
                case 0:
                    t=10 / what; // сгенерировать ошибку деления на нуль
                    break;
                case 1:
                    nums[4]=4; // сгенерировать ошибку обращения к массиву
                    break;
                case 2:
                    return; // возвратиться из блока try
            }
        }catch (ArithmeticException exc){
            // перехватить исключение
            System.out.println("Can't divide by Zero!");
            return; // возвратиться из блока catch
        }catch (ArrayIndexOutOfBoundsException exc){
            // перехватить исключение
            System.out.println("No matching element found.");
        }
        // Этот блок вызывается независимо от того, каким
        // образом завершится блок try/catch.
        finally {
            System.out.println("Leaving try.");
        }
    }
}
public class FinallyDemo{
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            UseFinally.genException(i);
            System.out.println();
        }
    }
}