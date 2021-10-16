package cz.osu.student.r19584.kip7opr1.cv2g;

import java.awt.Color;

public class Main {

    public static void main(String[] args) {
        Gui gui = new Gui();

        Point p2 = new Point(70, 50, Color.BLUE);
        Rectangle r1 = new Rectangle(50, 50, 150, 100, Color.RED);
        Rectangle r2 = new Rectangle(200, 200, 100, 100, Color.BLUE);

        gui.addShape(p2);
        gui.addShape(r1);
        gui.addShape(r2);
        gui.addShape(new Point(100, 100, Color.GREEN));

        gui.printEnvironment();
    }
}
