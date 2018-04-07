package avtoupakovka;

// Упаковка и распаковка значений врунчную.
public class Wrap {
    public static void main(String[] args) {

        // Упаковка значения 100 производится вручную.
        Integer iob = new Integer(100);

        // Распаковка значения 100 производится вручную.
        int i = iob.intValue();

        System.out.println(i + " " + iob); // отображает значение 100 и 100
    }
}
