package isklu4eniya;

// Демонстрация обработки исключений.
public class ExcDemo1 {
    public static void main(String[] args) {
        int nums[]=new int[4];

        // Создание блока try.
        try{
            System.out.println("Before exception is generated.");

            // Попытка обратиться за границы массива.
            nums[7]=10;
            System.out.println("this won't be displayed");
        }
        // Перехват исключения в связи с обращением за границу массива.
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
