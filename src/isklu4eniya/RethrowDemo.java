package isklu4eniya;

// Повторное генерирование исключений.
class Rethrow {
    public static void getException() {
        // Массив numet длиннее массива denom.
        int numer[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};

        for (int i=0;i<numer.length;i++){
            try {
                System.out.println(numer[i]+" / "+denom[i]
                        +" is "+numer[i]/denom[i]);
            }
            catch (ArithmeticException exc){
                // перехватить исключение
                System.out.println("Can't divide by Zero!.");
            }
            catch (ArrayIndexOutOfBoundsException exc){
                // перехватить исключение
                System.out.println("No matching element found.");
            throw exc; // Повторное генерирование исключения.
            }
        }
    }
}
public class RethrowDemo{
    public static void main(String[] args) {
        try {
            Rethrow.getException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            // Перехват повторно сгенерированного исключения.
            System.out.println("Fatal error - program terminated.");
        }
    }
}


