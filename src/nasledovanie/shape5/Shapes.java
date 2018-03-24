package nasledovanie.shape5;

// Добавление дополнительных конструкторов в класс TwoDShape.
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

    double area(){
        return getWidth()*getHeight()/2;
    }
    void showStyle(){
        System.out.println("Triangle is "+style);
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
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("right", 8.0,12.0);
        Triangle t3 = new Triangle(4.0);
        t1 = t2;

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());

        System.out.println();

        System.out.println("Info for t3: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area is "+t3.area());
    }
}
