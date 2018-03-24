package nasledovanie.shape7;

// Многоуровневая иерархия.
class TwoDShape{
    private double width;
    private double height;

    // Конструктор по умолчанию.
    TwoDShape(){
        width = height = 0.0;
    }
    // Параметризированный конструктор.
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }
    // Конструирование объекта с одинаковыми значениями
    // переменных экземпляра width и height.
    TwoDShape(double x){
        width = height = x;
    }
    // Построение одного объекта на основе другого объекта.
    TwoDShape(TwoDShape ob){
        width = ob.width;
        height = ob.height;
    }
    // Методы доступа к переменным экземпляра width и height.
    double getWidth(){return width;}
    double getHeight(){return height;}
    void setWidth(double w){width=w;}
    void setHeight(double h){height=h;}

    void showDim(){
        System.out.println("Width and height are "+width+" and "+height);
    }
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
        super(w, h); // вызвать конструктор суперкласса с двумя аргументами
        style = s;
    }
    // Конструктор с одним аргументом.
    Triangle(double x){
        super(x); // вызвать конструктор суперкласса с одним аргументом
        style = "isosceles";
    }
    // Построение одного объекта на основе другого объекта.
    Triangle(Triangle ob){
        // Передача ссылки на объект Triangle конструктору класса TwoDShape.
        super(ob);
        style = ob.style;
    }
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
    Rectangle(double w, double h){
        super(w, h);
    }
    boolean isSquare(){
        if (getWidth()==getHeight()) return true;
        return false;
    }
    double area(){
        return getWidth() * getHeight();
    }
}

public class Shapes {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("right",8.0,12.0);
        // создать копию объекта t1
        Triangle t2 = new Triangle(t1);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        // Из объекта класса ColorTriangle иожно вызывать как его
        // собственные методы, так и методы его суперклассов.
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());
    }
}
