package cz.osu.student.r19584.kip7opr1.cv2g;

import java.awt.Color;

public class Rectangle implements Shape {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw(Gui gui) {
        for (int i = getX(); i < getWidth() + getX(); i++) {
            for (int j = getY(); j < getHeight() + getY(); j++) {
                gui.putPixel(i, j, getColor());
            }
        }
    }
}
