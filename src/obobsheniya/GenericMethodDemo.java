package obobsheniya;

// Пример простого обобщенного метода
public class GenericMethodDemo {
    // Этот обобщенный метод определяет,
    // совпадает ли содержимое двух массивов.
    static <T, V extends T> boolean arraysEqual(T[] x, V[] y){
        // Если массивы имеют разную длину, они не могут быть одинаковыми.
        if (x.length != y.length) return false;
        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false; // Массивы отличаются.
        return true; // Содержимое массивов совпадает.
    }
    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};
        Integer nums3[] = {1,2,7,4,5};
        Integer nums4[] = {1,2,7,4,5,6};

        // Аргументы типа T и V неявано определяются при вызове метода.
        if (arraysEqual(nums, nums))
            System.out.println("nums equals nums");
        if (arraysEqual(nums, nums2))
            System.out.println("nums equals nums2");
        if (arraysEqual(nums, nums3))
            System.out.println("nums equals nums3");
        if (arraysEqual(nums, nums4))
            System.out.println("nums equals nums4");
        // создать массив объектов типа Double
        Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

        // Следующая строка не будет скомпилированна, так как
        // типы nums и dvals не совпадают.
        if (arraysEqual(nums,dvals))
            System.out.println("nums equals dvals");
    }
}
