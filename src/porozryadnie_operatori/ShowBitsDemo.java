package porozryadnie_operatori;
/*
    Пример для опробования 5.3

    Создание класса для отображения значений в двоичном виде.
 */
class ShowBits {
    int numbits;

    ShowBits(int n){
        numbits = n;
    }
    void show(long val){
        long mask = 1;

        // Сдвинуть значение 1 влево на нужную позицию
        mask <<= numbits-1;

        int spacer = 0;
        for (; mask!=0; mask>>>=1){
            if ((val & mask)!=0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8)==0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

// продемонстрировать класс ShowBits
public class ShowBitsDemo {
    public static void main(String[] args) {
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(32);
        ShowBits li = new ShowBits(64);

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        // можно также отобразить младшие разряды любого цельного числа
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}
