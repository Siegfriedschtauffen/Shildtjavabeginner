package applets;

// Апплеты с минимальными функциональными возможностями.
import java.awt.*; // Обратите внимание на эти операторы.
import java.applet.*;

public class SimpleApplet extends Applet {
    // Вывод символьной строки в окне апплета.
    public void paint(Graphics g) {
        g.drawString("Java makes applets easy", 20, 20);
    }
}
