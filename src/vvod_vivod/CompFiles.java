package vvod_vivod;

import java.io.*;
/*
    Пример для опробования 10.1.

    Сравнение двух файлов.
    Для того чтобы воспользоваться этой программой, укажите
    имена сравниваемых файлов в командной строке, например:

    java CompFile FIRST.TXT SECOND.TXT
 */
public class CompFiles {
    public static void main(String[] args) {
        int i=0, j=0;

        // Прежде всего следует убедиться. что файлы были указаны.
        if (args.length!=2){
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }
        // сравнить файлы
        try (FileInputStream f1 = new FileInputStream(args[0]);
            FileInputStream f2 = new FileInputStream(args[1])){
            // проверить содержимое каждого файла
            do {
                i = f1.read();
                j = f2.read();
                while (i>='A'&i<='Z'&j==i+32) i=j;
                while (i>='a'&i<='z'&j==i-32) i=j;
                System.out.print((char) i);
                if (i!=j){
                    System.out.print(" - текст совпадал до этого момента.");
                    break;
                }
            }while (i!=-1&&j!=-1);
            if (i!=j)
                System.out.println("Files differ.");
            else
                System.out.println("Files are the same.");
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
