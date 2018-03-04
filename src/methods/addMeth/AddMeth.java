package methods.addMeth;

// Добавление метода range в класс methods.
class Vehicle {
    int passengers; // количество пассажиров
    int fuelcap;   // емкость топливного бака
    int mpg;        // потребление топлива в милях на галлон

    // отобразить дальность действия транспортного средства
    // Метод range() относится к классу methods.
    // Обратите внимание на то, что переменные fuelcap и mpg
    // указываются напрямую без имени объекта и оператора-точки.
    void range () {
        System.out.println("Range is " + fuelcap * mpg);
    }
}

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2; // не используется

        // присвоить значения полям в объекте minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        // присвоить значения полям в объекте sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();

        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();
    }
}
