package constructors.constr2;

// Параметризированный конструктор.

class MyClass {
    int x;

    // У этого конструткора имеется параметр.
    MyClass (int i){
        x = i;
    }
}

public class ParmConsDemo {
    public static void main(String[] args) {
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(88);

        System.out.println(t1.x + " " + t2.x);
    }
}
