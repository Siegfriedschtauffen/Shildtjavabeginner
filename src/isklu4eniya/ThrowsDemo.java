package isklu4eniya;

public class ThrowsDemo {
    // Обратите внимание на оператор throws в объявлении метода.
    public static char prompt(String str) throws java.io.IOException {
        System.out.println(str+": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;
        try {
            // В методе prompt() может быть сгенерировано исключение,
            // поэтому данный метод следует вызывать в блоке try
            ch = prompt("Enter a letter");
        }catch (java.io.IOException exc){
            System.out.println("I/O exception occurred.");
            ch = 'X';
        }
        System.out.println("You pressed "+ch);
    }
}
