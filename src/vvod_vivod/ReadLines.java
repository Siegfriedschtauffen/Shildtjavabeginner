package vvod_vivod;

import java.io.*;

// Чтение символьных строк с консоли средствами класса BufferedReader.
public class ReadLines {
    public static void main(String[] args) throws IOException {
        // создать объект типа BufferedReader, связанный с потоком System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");
        do {
            // использовать метод readLine() из класса BufferedReader
            // для чтения текстовой строчки
            str = br.readLine();
            System.out.println(str);
        }while (!str.equals("stop"));
    }
}
