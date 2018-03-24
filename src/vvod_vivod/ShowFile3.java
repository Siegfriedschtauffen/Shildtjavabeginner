package vvod_vivod;

import java.io.*;

/*
    В этой версии программы ShowFile оператор try с ресурсами
    применяется для автоматического закрытия файла, когда он
    уже больше не нужен.
 */
public class ShowFile3 {
    public static void main(String[] args) {
        int i;

        // Прежде всего следует убадиться, что файл был указан.
        if (args.length!=1){
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // Ниже оператор try с ресурсами применяется сначала для открытия, а
        // затем для автоматического закрытия файла после выхода из блока try.
        try (FileInputStream fin = new FileInputStream(args[0])){
            // Блок оператора try с ресурсами.
            do {
                i=fin.read();
                if (i!=-1) System.out.print((char)i);
            }while (i!=-1);
        }catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
