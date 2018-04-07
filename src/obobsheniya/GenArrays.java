package obobsheniya;

// Обобщенные типы и массивы.
class Gen3<T extends Number>{
    T ob;
    T vals[]; // Допустимо.

    Gen3(T o, T[] nums){
        ob = o;

        // Следующее выражение недопустимо:
      //  vals = new T[10]; // Нельзя создать массив типа T.

        // Следующее выражение составлено верно.
        vals = nums; // Переменной допускается присваивать ссылку
                     // на существующий массив.
    }
}
public class GenArrays {
    public static void main(String[] args) {
        Integer n[] = { 1, 2, 3, 4, 5 };

        Gen3<Integer> iOb = new Gen3<Integer>(50, n);

        // Нельзя создать массив обобщенных ссылок
        // на объекты конкретного типа.
        // Gen3<Integer> gens[] = new Gen3<Integer>[10]; // Ошибка!

        // Следующее выражение составлено верно.
        Gen3<?> gens[] = new Gen3<?>[10];
    }
}
