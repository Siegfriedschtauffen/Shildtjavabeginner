package vvod_vivod;

import java.io.*;

/* Копирование текстового файла.

    При вызове этой программы следует указать имя исходного
    и целевого файла. Например, для копирования файла FIRST.TXT
    в файл SECOND.TXT в коммандной строке нужно указать следующее:

    java CopyFile FIRST.TXT SECOND.TXT
 */
public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        FileOutputStream fout;

        // Прежде всего следует убедиться, что оба файла были указаны.
        if (args.length!=2) {
            System.out.println("Usage: CopyFile From To");
            return;
        }
        // открыть исходный файл
        try {
            fin = new FileInputStream(args[0]);
        }catch (FileNotFoundException e){
            System.out.println("Input File Not Found");
            return;
        }
        // открыть целевой файл
        try {
            fout = new FileOutputStream(args[1]);
        }catch (FileNotFoundException e){
            System.out.println("Error Opening Output File");
            // закрыть исходный файл
            try {
                fin.close();
            }catch (IOException e2){
                System.out.println("Error closing input file");
            }
            return;
        }
        // копировать файл
        try {
            do {
                // Чтение байтов из одного файла и запись их в другой файл.
                i=fin.read();
                if (i!=-1)fout.write(i);
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("File Error");
        }
        try {
            fin.close();
        }catch (IOException e){
            System.out.println("Error closing input file.");
        }
        try {
            fout.close();
        }catch (IOException e){
            System.out.println("Error closing output file.");
        }
    }
}
