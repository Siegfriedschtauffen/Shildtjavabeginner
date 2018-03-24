package isklu4eniya;

// Эта программа не будет работать нормально!
public class ExcTypeMismatch {
    public static void main(String[] args) {
        int nums[]=new int[4];

        // Создание блока try.
        try{
            System.out.println("Before exception is generated.");

            // При выполнении следующего оперетора возникает
            // исключение ArrayIndexOutOfBoundsException
            nums[7]=10;
            System.out.println("this won't be displayed");
        }
        /* Исключение, связанное с обращением за границу массива,
           нельзя обработать с помощью оператора catch, в котором
           указан тип исключения ArithmeticException. */
        catch (ArithmeticException exc){
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
