package annotacii;

// Пример использования аннотации @Deprecated.

// Пометить класс как не рекомндованный к применнию.
@Deprecated
class MyClass{
    private String msg;

    MyClass(String m){
        msg = m;
    }

    // Пометить метод в классе как
    // не рекомндованный к применению.
    @Deprecated
    String getMsg(){
        return msg;
    }
    // ...
}
public class AnnoDemo {
    public static void main(String[] args) {
        MyClass myObj = new MyClass("test");

        System.out.println(myObj.getMsg());
    }
}
