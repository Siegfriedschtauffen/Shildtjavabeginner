package staticimport;
// Применение статического импорта с целью
// упростить вызовы методов sqrt() и pow().

// Средствами статического импорта обеспечивается
// непосредственный доступ к методам sqrt() и pow().
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Решение квадратного уравнения.
public class Quadratic {
    public static void main(String[] args) {

        // Переменные a, b и c обозначают коэффициенты
        // квадратного уравнения ax2 + bx + c = 0
        double a, b, c, x;

        // решить квадратное уравнение 4x2 + x - 3 = 0
        a = 4;
        b = 1;
        c = -3;

        // найти первое решение
        x = (-b + sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("First solution: " + x);

        // найти второе решение
        x = (-b - sqrt(pow(b, 2) - 4 * a * c)) / (2 * a);
        System.out.println("Second solution: " + x);
    }
}
