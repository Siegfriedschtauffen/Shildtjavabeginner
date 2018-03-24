package nasledovanie.shape4;

// Добавление конструктора в класс TwoDShape.
class TwoDShape{
    private double width;
    private double height;

    // Параметризированный конструктор объектов класса TwoDShape.
    TwoDShape(double w, double h){
        width = w;
        height = h;
    }

    // Методы доступа к значениям закрытых переменных width и height.
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

    // конструктор
    Triangle(String s, double w, double h){
        // Использование оператора super() для вызова
        // конструктора класса TwoDShape.
        super(w, h);
        style = s;

    }

    double area(){
        // Из класса Triangle можно обращаться к членам класса
        // TwoDShape, таким же образом, как и к собственным членам.
        // Применение методов доступа, предоставляемых суперклассом.
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
        Triangle t1 = new Triangle("isosceles",4.0, 4.0);
        Triangle t2 = new Triangle("right", 8.0,12.0);

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is "+t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is "+t2.area());
    }
}
