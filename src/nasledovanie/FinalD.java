package nasledovanie;

// Возврат объекта типа String.
class ErrorMsg {
    // Код ошибок.
    // Константы объявляются с помощью ключевого слова final.
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String msgs[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };
    // возвратить сообщение об ошибке
    String getErrorMsg(int i){
        if (i>=0 & i<msgs.length)
            return msgs[i];
        else
            return "Invalid Error Code";
    }
}

public class FinalD {
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        // При вызове метода используются константы,
        // объявленные с помощью ключевого слова final.
        System.out.println(err.getErrorMsg(err.OUTERR));
        System.out.println(err.getErrorMsg(err.DISKERR));
    }
}
