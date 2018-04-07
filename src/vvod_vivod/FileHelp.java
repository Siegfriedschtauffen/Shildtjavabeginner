package vvod_vivod;

/*
    Пример для опробования 10.2.

    Справочная система, находящаяся на диске.
 */
import java.io.*;
/*
    В классе Help открывается файл со справочной информацией,
    производиься поиск названия темы, а затем отображается
    справочная информация по этой теме.
    Обратите внимание на то, что в этом классе поддерживаются
    все исключения, освобождая от этой обязанности вызывающий код
 */
class Help {
    String helpFile; // Имя файла со справочной информацией.

    Help(String fname){
        helpFile=fname;
    }

    // отобразить справочную информацию по заданной теме
    boolean helpon(String what){
        int ch;
        String topic, info;

        // открыть справочный файл
        try (BufferedReader helpRdr = new BufferedReader(new FileReader(helpFile))){
            do {
                // читать символы до тех пор, пока не встретится знак #
                ch = helpRdr.read();

                // а теперь проверить, совпадают ли темы
                if (ch=='#'){
                    topic = helpRdr.readLine();
                    if (what.compareTo(topic)==0) {   // found topic
                        do {
                            info = helpRdr.readLine();
                            if (info!=null) System.out.println(info);
                        }while((info!=null)&&(info.compareTo("")!=0));
                        return true;
                    }
                }
            }while (ch!=-1);
        }catch (IOException e){
            System.out.println("Error accessing help file.");
            return false;
        }
        return false; // тема не найдена
    }

    // получить тему
    String getSelection(){
        String topic = "";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter topic: ");
        try {
            topic = br.readLine();
        }
        catch (IOException e){
            System.out.println("Error reading console.");
        }
        return topic;
    }
}

// продемонстрировать спраочную систему, находящуюся на диске
public class FileHelp {
    public static void main(String[] args) {
        Help hlpobj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. Enter 'stop' to end.");
        do {
            topic = hlpobj.getSelection();

            if (!hlpobj.helpon(topic))
                System.out.println("Topic not found.\n");
        }while (topic.compareTo("stop")!=0);
    }
}
