package nasledovanie.lessone;
//
//// Простая иерархия классов.
//
//// Класс, описывающий двумерные объекты.
//class TwoDShape{
//    private double width;
//    private double height;
//
//    // Методы доступа к значениям закрытых переменных width и height.
//    double getWidth(){return width;}
//    double getHeight(){return height;}
//    void setWidth(double w){width=w;}
//    void setHeight(double h){height=h;}
//
//    void showDim(){
//        System.out.println("Width and height are "+width+" and "+height);
//    }
//}
//// Подкласс класса TwoDShape для представления треугольника.
//// Класс Triangle наследует от класса TwoDShape
//class Triangle extends TwoDShape {
//    String style;
//
//    double area(){
//        // Из класса Triangle можно обращаться к членам класса
//        // TwoDShape, таким же образом, как и к собственным членам.
//        // Применение методов доступа, предоставляемых суперклассом.
//        return getWidth()*getHeight()/2;
//    }
//    void showStyle(){
//        System.out.println("Triangle is "+style);
//    }
//}
//// Подкласс класса TwoDShape, представляющий прямоугольники.
//class Rectangle extends TwoDShape{
//    boolean isSquare(){
//        if (getWidth()==getHeight()) return true;
//        return false;
//    }
//    double area(){
//        return getWidth() * getHeight();
//    }
//}
//public class Shapes {
//    public static void main(String[] args) {
//        Triangle t1 = new Triangle();
//        Triangle t2 = new Triangle();
//
//        // Все члены класса Triangle, даже унаследование от класса
//        // TwoDShape, доступно из объектов типа Triangle.
//        t1.setWidth(4.0);
//        t1.setHeight(4.0);
//        t1.style = "isosceles";
//
//        t2.setWidth(8.0);
//        t2.setHeight(12.0);
//        t2.style = "right";
//
//        System.out.println("Info for t1: ");
//        t1.showStyle();
//        t1.showDim();
//        System.out.println("Area is "+t1.area());
//
//        System.out.println();
//
//        System.out.println("Info for t2: ");
//        t2.showStyle();
//        t2.showDim();
//        System.out.println("Area is "+t2.area());
//    }
//}
