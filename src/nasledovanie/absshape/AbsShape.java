package nasledovanie.absshape;

// Создание абстрактного класса.

// Теперь класс TwoDShape является абстрактным.
abstract class TwoDShape{
    private double width;
    private double height;
    private String name;

    // Конструктор по умолчанию.
    TwoDShape(){
        width = height = 0.0;
        name = "null";
    }
    // Параметризированный конструктор.
    TwoDShape(double w, double h, String n){
        width = w;
        height = h;
        name = n;
    }
    // Конструирование объекта с одинаковыми значениями
    // переменных экземпляра width и height.
    TwoDShape(double x, String n){
        width = height = x;
        name = n;
    }
    // Построение одного объекта на основе другого объекта.
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }
    // Методы доступа к переменным экземпляра width и height.
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width=w;}
    void setHeight(double h){height=h;}

    String getName(){return name;}

    void showDim(){
        System.out.println("Width and height are "+width+" and "+height);
    }
    // Теперь метод area() является абстрактным
    abstract double area();
}

// Подкласс класса TwoDShape для представления треугольника.
// Класс Triangle наследует от класса TwoDShape
class Triangle extends TwoDShape {
    private String style;
    // Использования опереатора super() для вызова
    // разных вариантов конструктора TwoDShape().
    // Конструктор по умолчанию.
    Triangle(){
        super(); // вызвать конструктор суперкласса по умолчанию
        style = "null";
    }
    // Параметризированный конструктор.
    Triangle(String s, double w, double h){
        super(w, h,"triangle"); // вызвать конструктор суперкласса
        style = s;
    }
    // Конструктор с одним аргументом.
    Triangle(double x){
        super(x, "triangle"); // вызвать конструктор суперкласса
        style = "isosceles";
    }
    // Построение одного объекта на основе другого объекта.
    Triangle(Triangle ob){
        // Передача ссылки на объект Triangle конструктору класса TwoDShape.
        super(ob);
        style = ob.style;
    }
    // Переопределение метода area() для класса Triangle.
    double area(){
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is "+style);
    }
}

// Подкласс, производный от класса Triangle.
/* Класс ColorTriangle является подклассом,
   производным от класса Triangle, который, в
   свою очередь, расширяет класс TwoDShape.
   Следовательно, в класс ColorTriangle входят переменные
   и методы как из класса Triangle, так из класса TwoDShape. */
class ColorTriangle extends Triangle {
    private String color;
    ColorTriangle(String c, String s, double w, double h){
        super(s, w, h);
        color = c;
    }
    String getColor(){return color;}
    void showColor(){
        System.out.println("Color is "+color);
    }
}

// Подкласс класса TwoDShape, представляющий прямоугольники.
class Rectangle extends TwoDShape {
    // Конструктор по умолчанию.
    Rectangle(){
        super(); // вызвать конструктор суперкласса по умолчанию
    }
    // Конструктор класса Rectangle.
    Rectangle(double w, double h){
        super(w, h,"rectangle"); // вызвать конструктор суперкласса
    }
    // построить квадрат
    Rectangle(double x){
        super(x, "rectangle"); // вызвать конструктор суперкласса
    }
    // Построение одного объекта на основе другого объекта.
    Rectangle(Rectangle ob){
        // Передача ссылки на объект Rectangle конструктору класса TwoDShape.
        super(ob);
    }
    boolean isSquare(){
        if (getWidth()==getHeight())return true;
        return false;
    }
    // Переопределение метода area() для класса Rectangle.
    double area(){
        return getWidth()*getHeight();
    }
}

public class AbsShape {
    public static void main(String[] args) {
        TwoDShape shapes[] = new TwoDShape[4];
        shapes[0] = new Triangle("right", 8.0, 12.0);
        shapes[1] = new Rectangle(10);
        shapes[2] = new Rectangle(10,4);
        shapes[3] = new Triangle(7.0);

        for (int i=0; i<shapes.length; i++){
            System.out.println("object is "+shapes[i].getName());
            // Требумемый вариант метода area() вызывается
            // для каждой геометрической фигуры в отдельности.
            System.out.println("Area is "+shapes[i].area());
            System.out.println();
        }
    }
}
