package vvod_vivod;

import java.io.*;

// Простая утилита ввода с диска и вывода на экран,
// демонстрирующая применение класса FileReader.
public class DtoS {
    public static void main(String[] args) {
        String s;
        // Создание в классе BufferedReader оболочки с целью заключить
        // в нее класс FileReader и организовать чтение данных из файла.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
