package isklu4eniya;

// Применение вложенных блоков try.
public class NestTrys {
    public static void main(String[] args) {
        // Здесь массив numet длиннее массива denom.
        int numer[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};

        // Вложенные блоки try.
        try { // Внешний блок try.
            for (int i = 0; i < numer.length; i++) {
                try { // Внутренний блок try.
                    System.out.println(numer[i] + " / " + denom[i]
                            + " is " + numer[i] / denom[i]);
                }
                catch (ArithmeticException exc) {
                    // перехватить исключение
                    System.out.println("Can't divide by Zero!");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // перехватить исключение
            System.out.println("No matching element found.");
            System.out.println("Fatal error - program terminated.");
        }
    }
}
