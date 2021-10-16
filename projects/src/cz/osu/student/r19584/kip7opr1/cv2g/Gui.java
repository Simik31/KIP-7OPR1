package cz.osu.student.r19584.kip7opr1.cv2g;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Gui implements KeyListener, MouseMotionListener {

    private JFrame window;
    private Color backgroundColor;
    private BufferedImage image;
    private ArrayList<Shape> shapes;

    public Gui() {
        window = new JFrame("CV2 Graphics Window");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
        window.addKeyListener(this);
        window.addMouseMotionListener(this);

        shapes = new ArrayList<>();

        backgroundColor = Color.DARK_GRAY;

        image = new BufferedImage(window.getWidth(), window.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

        Graphics2D graphics = image.createGraphics();
        graphics.setColor(backgroundColor);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());

        printImage();
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void Refresh() {
        cleanImage();
        printEnvironment();
    }

    public void cleanImage() {
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(backgroundColor);
        graphics.fillRect(0, 0, image.getWidth(), image.getHeight());
    }

    public Color getPixel(int x, int y) {
        return new Color(image.getRGB(x, y));
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void printEnvironment() {
        for (Shape shape : shapes) {
            shape.draw(this);
            printImage();
        }
    }

    private void printImage() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        window.getGraphics().drawImage(image, 0, 0, null);
    }

    public void putPixel(int _x, int _y, Color _color) {
        image.setRGB(_x, _y, _color.getRGB());
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        window.setTitle("x: " + e.getX() + " y: " + e.getY());
    }
}
