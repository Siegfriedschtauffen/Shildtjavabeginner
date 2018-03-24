package vvod_vivod;

import java.io.IOException;

// Чтение байтов с клавиатуры в массив.
public class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[]=new byte[10];

        System.out.println("Enter some characters.");
        // Чтение данных, введенных с клавиатуры,
        // и размещение их в байтовом массиве
        System.in.read(data, 2,5);
        System.out.print("You entered: ");
        for (int i=0;i< data.length;i++)
            System.out.print((char)data[i]);
    }
}
