package methods.vehicleDemo;

/*
    Программа, в которой используется класс Vehicle.

    Присвоить ее исходному файлу имя vehicleDemo.java
 */
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;    // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон
}

// В этом классе объявляется объект типа methods.
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

        // присвоить значения полям в объекте minivan
        // Обратите внимание на применение оператора-точки
        // для доступа к переменным экземпляра данного объекта.
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // рассчитать дальность действия транспортного средства,
        // исходя из того, что топливный бак заполнен
        range = minivan.fuelcap*minivan.mpg;
        System.out.println("Minivan can carry "+minivan.passengers+" with a range of "+range);
    }
}
