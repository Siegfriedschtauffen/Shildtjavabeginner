import java.io.IOException;

/*
    Пример для опробования 3.2.

    Расширенная справочная система, в которой для оброботки
    результатов выбора из меню используется цикл do-while.
 */

public class Help2 {
    public static void main(String[] args) throws IOException {
        char choice, ignore;

        do {
            System.out.println("Help on:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Choose one: ");

            choice = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (choice < '1' | choice > '5');

        System.out.println("\n");

        switch (choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа;");
                System.out.println("\t\tпоследовательность операторов;");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}\n");
                break;
            case '3':
                System.out.println("The for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("The while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '5':
                System.out.println("The do-while:\n");
                System.out.println("do {");
                System.out.println("\tоператор;");
                System.out.println("} while (условие);");
                break;

        }
    }
}
