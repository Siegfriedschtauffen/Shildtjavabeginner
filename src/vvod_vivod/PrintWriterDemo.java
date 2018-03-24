package vvod_vivod;

import java.io.PrintWriter;

// Применение класса PrintWriter.
public class PrintWriterDemo {
    public static void main(String[] args) {
        // Создание объекта класса PrintWriter, связанного
        // с потоком стандартного вывода System.out.
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);

        pw.println(i+" + "+d+" is "+(i+d));
    }
}
