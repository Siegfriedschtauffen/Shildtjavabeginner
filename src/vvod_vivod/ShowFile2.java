package vvod_vivod;

import java.io.*;

/*
    В этой версии программы отображения текстового файла код,
    открывающий файл и получающий к нему доступ, заключается
    в единый блок try. А закрывается файл в блоке finally.
 */
public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Прежде всего следует убадиться, что файл был указан.
        if (args.length!=1){
            System.out.println("Usage: ShowFile File");
            return;
        }

        // В следующем коде открывается файл, из которого читаются
        // символы до тех пор, пока не встретится знак EOF, а затем
        // файл закрывается в блоке finally.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i=fin.read();
                if (i!=-1) System.out.println((char)i);
            }while (i!=-1);
        }catch (FileNotFoundException e){
            System.out.println("File Not Found.");
        }catch (IOException e){
            System.out.println("An I/O Error Occurred");
        }finally {
            // Файл закрывается в любом случае.
            try {
                if (fin!=null)fin.close();
            }catch (IOException e){
                System.out.println("Error Closing File");
            }
        }
    }
}
