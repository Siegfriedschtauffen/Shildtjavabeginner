package breakandcontinue.continues;
// Применить оператор continue с меткой.

public class ContToLabel {
    public static void main(String[] args) {

        outerloop:
            for (int i=0; i<10; i++) {
                System.out.print("\nOuter loop pass " + i + ", Inner loop: ");
                for (int j=0; j<10; j++) {
                    if (j==5) continue outerloop; // продолжить внешний цикл
                    System.out.print(j);
                }
            }
    }
}
