import java.io.IOException;
/*
    Пример для опробования 4.1.

    Преобразование в класс HelpMe справочной системы
    из примера для опробования 3.3.
 */
class HelpMe {
    void helpon(int what){
        switch (what) {
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
            case '6':
                System.out.println("The break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("The continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();
    }
    void showmenu(){
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Выберите или нажмите q для выхода: ");
    }
    boolean isvalid(char ch){
        if(ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
public class HelpClassDemo {
    public static void main(String[] args) throws IOException {
        HelpMe help = new HelpMe();
        char choice, ignore;
        for (;;){
            do {
                help.showmenu();
                choice = (char) System.in.read();
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!help.isvalid(choice));
            if (choice == 'q') break;
            System.out.println("\n");
            help.helpon(choice);
        }
    }
}
