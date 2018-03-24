package isklu4eniya;

// Генерирование исключений вручную.
public class ThrowDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Before throw.");
            // Генерирование исключений.
            throw new ArithmeticException();
        }
        catch (ArithmeticException exc){
            // перехватить исключение
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
