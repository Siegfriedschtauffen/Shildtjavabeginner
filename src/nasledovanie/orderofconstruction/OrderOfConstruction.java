package nasledovanie.orderofconstruction;

// Демонстрация порядка вызова конструкторов.
class A{
    A(){
        System.out.println("Constructing A.");
    }
}
// Создать подкласс путем расширения A.
class B extends A{
    B(){
        System.out.println("Constructing B.");
    }
}
// Создать подкласс путем расширения B.
class C extends B{
    C(){
        System.out.println("Constructing C.");
    }
}
public class OrderOfConstruction {
    public static void main(String[] args) {
        C c = new C();
    }
}
