// Видоизменить пример 2.2., чтобы вместо логических значений true и false
// отображались значения 1 и 0.
public class LogicalOpTable2 {
    public static void main(String[] args) {
        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&q)?1:0) + "\t\t" + ((p|q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));

        p = true; q = false;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&q)?1:0) + "\t\t" + ((p|q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));

        p = false; q = true;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&q)?1:0) + "\t\t" + ((p|q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));

        p = false; q = false;
        System.out.print((p?1:0) + "\t\t" + (q?1:0) + "\t\t");
        System.out.print(((p&q)?1:0) + "\t\t" + ((p|q)?1:0) + "\t\t");
        System.out.println(((p^q)?1:0) + "\t\t" + ((!p)?1:0));
    }
}      // Я МЛЯТЬ ГЕНИЙ!
