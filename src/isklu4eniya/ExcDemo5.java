package isklu4eniya;

// В операторах catch исключения типа подкласса должны
// предшествовать исключениям типа суперкласса.
public class ExcDemo5 {
    public static void main(String[] args) {
        // Здесь массив numet длиннее массива denom.
        int numer[]={4,8,16,32,64,128,256,512};
        int denom[]={2,0,4,4,0,8};

        for (int i=0;i<numer.length;i++){
            try {
                System.out.println(numer[i]+" / "+denom[i]
                        +" is "+numer[i]/denom[i]);
            }
            // Перехват исключения от подкласса.
            catch (ArrayIndexOutOfBoundsException exc){
                // перехватить исключение
                System.out.println("No matching element found.");
            }
            // Перехват исключения от суперкласса.
            catch (Throwable exc){
                // перехватить исключение
                System.out.println("Some exception occurred.");
            }
        }
    }
}
