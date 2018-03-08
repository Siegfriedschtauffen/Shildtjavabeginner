package classes_and_methods.callbyref;

// Объекты передаются методам по ссылке.
class Test{
    int a,b;

    Test(int i, int j){
        a=i;
        b=j;
    }
    /* Передача объекта методу. Теперь переменные ob.a b и ob.b
       из передаваемого объекта можно изменить. */
    void change(Test ob){
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}
public class CallByRef {
    public static void main(String[] args) {
        Test ob = new Test(15,20);

        System.out.println("ob.a and ob.b before call: "+ob.a+" "+ob.b);

        ob.change(ob);

        System.out.println("ob.a and ob.b after call: "+ob.a+" "+ob.b);
    }
}