package obobsheniya;

class A{
    // ...
}
class B extends A{
    // ...
}
class C extends A{
    // ...
}
// Обратите внимание на то, что D не является подклассом A.
class D{
    // ...
}
public class UseBoundWildcard {
    // Здесь знак ? устанавливает соответствие
    // классу A или производным от него подклассам.

    // В объявлении этого метода используется ограниченный
    // метасимвольный аргумент.
    static void test(Gen<? extends A> o){
        // ...
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<A>(a);
        Gen<B> w2 = new Gen<B>(b);
        Gen<C> w3 = new Gen<C>(c);
        Gen<D> w4 = new Gen<D>(d);

        // Эти вызовы метода test() допустимы, так как
        // объект w, w2 и w3 относятся к подклассу A.
        test(w);
        test(w2);
        test(w3);

        // А этот вызов метода test() недопустим, так как
        // объект w4 не относится к подклассу A.
       // test(w4);

    }
}
