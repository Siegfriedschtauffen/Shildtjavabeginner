package vvod_vivod;

import java.io.*;

// Простой пример ввода с клавиатуры и вывода данных
// на диск, демонстрирующий применение класса FileWriter.
public class KtoD {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit).");
        // Создание потока вывода типа FileWriter.
        try (FileWriter fw = new FileWriter("test.txt")){
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop")==0) break;
                str = str+"\r\n"; // add newline
                // Запись текстовых строк в файл.
                fw.write(str);
            }while (str.compareTo("stop")!=0);
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
