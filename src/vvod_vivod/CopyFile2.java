package vvod_vivod;

import java.io.*;

/* Копирование текстового файла.

    В этой версии программы CopyFile используется оператор try с
    ресурсами. В ней демонстрируется управление двумя ресурсами
    (в данном случае - файлами) с помощью единственного оператора try

    java CopyFile FIRST.TXT SECOND.TXT
 */
public class CopyFile2 {
    public static void main(String[] args) {
        int i;
        // Прежде всего следует убедиться, что оба файла были указаны.
        if (args.length!=2) {
            System.out.println("Usage: CopyFile From To");
            return;
        }
        // открыть исходный файл
        try (FileInputStream fin=new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])){
            // Управление двумя ресурсами (в данном случае - файлами).
            do {
                i=fin.read();
                if (i!=-1)fout.write(i);
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("I/O Error:: "+e);
        }
    }
}
