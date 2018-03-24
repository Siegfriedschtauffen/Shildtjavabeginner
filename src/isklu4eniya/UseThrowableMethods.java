package isklu4eniya;

// Применение методов из класса Throwable.
class ExcTest2{
    static void genException(){
        int nums[]=new int[4];

        System.out.println("Before exception is generated.");

        // сгенерировать исключение в связи с попыткой
        // обращения за границы массива
        nums[7]=10;
        System.out.println("this won't be displayed");
    }
}
class UseThrowableMethods {
    public static void main(String[] args) {
        try {
            ExcTest2.genException();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            // перехватить исключение
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
