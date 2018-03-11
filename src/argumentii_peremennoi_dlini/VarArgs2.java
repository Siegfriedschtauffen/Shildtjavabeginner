package argumentii_peremennoi_dlini;

// Использование аргументов переменной длины вместе с обычными аргументами.
public class VarArgs2 {

    // Здесь msg - обычный аргумент, а v - аргумент переменной длины.
    static void vaTest(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("Contents: ");
        for (int i=0; i<v.length; i++)
            System.out.println(" arg "+i+": "+v[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("One vararg: ", 10);
        vaTest("Three vararg: ", 1,2,3);
        vaTest("No vararg: ");
    }
}
