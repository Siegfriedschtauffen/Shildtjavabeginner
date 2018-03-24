package vvod_vivod;

import java.io.*;

// Применение класса BufferedReader для чтения символов с консоли.
public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        // Создание объекта типа BufferedReader, связанного
        // с потоком стандартного ввода System.in.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter characters, period to quit.");

        // читать символы
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c!='.');
    }
}
