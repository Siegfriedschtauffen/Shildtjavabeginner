package breakandcontinue.breaks;
// Еще один пример оператора break с меткой.

public class Break5 {
    public static void main(String[] args) {

        done:
            for(int i=0; i<10; i++) {
                for (int j=0; j<10; j++) {
                    for (int k=0; k<10; k++) {
                        System.out.println(k + " ");
                        if (k==5) break done; // переход по метке done
                    }
                    System.out.println("After k loop"); // не выполнится
                }
                System.out.println("After j loop"); // не выполнится
            }
            System.out.println("After i loop");
    }
}
