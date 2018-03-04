package methods.twoVehicles;

// В этой программе создается два объекта methods.
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;   // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон
}

// В этом классе объявляется объект типа methods.
public class TwoVehicles {
    public static void main(String[] args) {
        // Помните что переменные minivan и sportscar
        // ссылаются на разные объекты
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

        // расчитать дальность действия транспортного средства
        // исходя из того, что топливный бак заполнен
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("Minivan can carry " + minivan.passengers + " with a range of " + range1);
        System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2);
    }
}
