package methods.retMath;

// Использование возвращаемого значения.
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;   // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    // Возврат дальности действия для заданного транспортного средства.
    int range() {
        return fuelcap * mpg;
    }
}

public class RetMath {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

        // присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        // получить дальность действия разных транспортных средств
        // Возвращаемое методом значяение присваивается переменной.

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can carry " + minivan.passengers + " with range of " + range1 + " Miles");
        System.out.println("Sportscar can carry " + sportscar.passengers + " with range of " + range2 + " Miles");
    }
}
