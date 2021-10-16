package cz.osu.student.r19584.kip7opr1.cv2g;

import java.awt.Color;

public class Point implements Shape {
    private int x;
    private int y;
    private Color color;

    public Point() {
        this(0, 0, Color.BLACK);
    }

    public Point(int _x, int _y, Color _color) {
        x = _x;
        y = _y;
        color = _color;
    }

    public int getX() {
        return x;
    }

    public void setX(int _x) {
        x = _x;
    }

    public int getY() {
        return y;
    }

    public void setY(int _y) {
        y = _y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color _color) {
        color = _color;
    }

    public void shiftCoordinates(int _x, int _y) {
        setX(getX() + _x);
        setY(getY() + _y);
    }

    public void draw(Gui gui) {
        gui.putPixel(getX(), getY(), getColor());
    }

    public void erase(Gui gui) {
        gui.putPixel(getX(), getY(), gui.getBackgroundColor());
    }

    @Override
    public String toString() {
        return "Point[" + getX() + ", " + getY() + "] RGB(" + getColor().getRed() + ", " + getColor().getGreen() + ", "
                + getColor().getBlue() + ")";
    }
}
