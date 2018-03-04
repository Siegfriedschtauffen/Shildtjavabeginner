package porozryadnie_operatori;


// Использование операции поразрядного исключающего ИЛИ
// для шифровки и дешифровки сообщений.
public class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        // зашифровать сообщение
        for (int i=0;i<msg.length();i++)
            // Построение зашифрованной строки сообщения.
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // дешифровать сообщение
        for (int i=0;i<msg.length();i++)
            // Построение дешифрованной строки сообщения.
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
