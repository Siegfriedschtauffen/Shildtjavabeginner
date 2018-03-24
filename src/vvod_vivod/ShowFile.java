package vvod_vivod;

import java.io.*;

/*
    Отображение текстового файла.

    При вызове этой программы следует указать имя файла,
    сожержимое которого требуется просмотреть.
    Например, для вывода на экран содержимого файла TEST.TXT,
    в командной строке необходимо указать следующее:

    java ShowFile TEST.TXT
 */
public class ShowFile {
    public static void main(String[] args){
        int i;
        FileInputStream fin;

        // Прежде всего следует убадиться, что файл был указан.
        if (args.length!=1){
            System.out.println("Usage: ShowFile File");
            return;
        }
        try {
            // Открытие файла.
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
            return;
        }
        try {
            // Читать из файла до тех пор, пока не встретится файл EOF.
            do {
                // Чтение из файла.
                i = fin.read();
                if (i != -1) System.out.print((char) i);
                // Если значение переменной i равно -1, значит,
                // достугнут конец файла.
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("Error reading file.");
            // Блок finally используется для закрытия файла.
        }finally {
            // Закрыть файл при выходе из блока try.
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
