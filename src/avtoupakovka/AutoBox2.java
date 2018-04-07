package avtoupakovka;

// Автоупаковка и автораспаковка при передаче
// параметров и возврате значений из методов.
public class AutoBox2 {
    // Этот метод принимает значение типа Integer.
    static void m(Integer v){
        System.out.println("m() received " + v);
    }
    // Этот метод возвращает значение типа int.
    static int m2(){
        return 10;
    }
    // Этот метод возвращает значение типа Integer.
    static Integer m3(){
        return 99; // Автоупаковка значения 99 в объект типа Integer.
    }
    public static void main(String[] args) {
        // Передача методу m() значения типа int.
        // метод m() принимает параметр типа Integer,
        // поэтому значение int автоматически упаковывается.
        m(199);

        // Здесь объект iOb получает значение типа int, возвращаемое
        // методом m2(). Это значение автоматически упаковывается,
        // чтобы его можно было присвоить объекту iOb.
        Integer iOb = m2();
        System.out.println("Return value from m2() is "+iOb);

        // А здесь метод m3() вовзращает значение типа Integer, которое
        // автоматически распаковывается и приобразуется в тип int.
        int i = m3();
        System.out.println("Return value from m3() is "+i);

        // Здесь методу Math.sqrt() в качестве параметра передается
        // объект iOb, который автоматически распаковывается, а его
        // значение продвигается к типа double, требующемуся для
        // выполнения данного метода.
        iOb = 100;
        System.out.println("Square root of iOb is "+Math.sqrt(iOb));
    }
}
