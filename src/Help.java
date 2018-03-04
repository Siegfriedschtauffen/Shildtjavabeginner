import java.io.IOException;

/*
    Пример для опробования 3.1. Простая справочная система

    Создать справочную систему, предоставляющую сведения о синтаксисе управляющих операторов Java.
 */

public class Help {
    public static void main(String[] args) throws IOException {
        char choice;

        System.out.println("Help on:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.print("Choose one: ");

        choice = (char)System.in.read();

        switch (choice){
            case '1':
                System.out.println("\nThe if:\n");
                System.out.println("if(условие) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("\nThe switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа;");
                System.out.println("\t\tпоследовательность операторов;");
                System.out.println("\t\tbreak;");
                System.out.println("\t// ...");
                System.out.println("}\n");
                break;
            default:
                System.out.println("Выбор не найден.");
        }
    }
}
