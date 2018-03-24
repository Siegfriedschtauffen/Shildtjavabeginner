package interfaces;

// Наследование интерфейсов.
interface A{
    void meth1();
    void meth2();
}

// Интерфейс B содержит методы meth1() и meth2(), а
// кроме того в него добавляется метода meth3().
interface B extends A{ // Интерфейс B наследует интерфейс A.
    void meth3();
}
class MyClass implements B{
    public void meth1(){
        System.out.println("Inmplement meth1().");
    }
    public void meth2(){
        System.out.println("Inmplement meth2().");
    }
    public void meth3(){
        System.out.println("Inmplement meth3().");
    }
}
public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
