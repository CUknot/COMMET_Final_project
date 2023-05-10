package entity;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Meteor extends Circle {
    private static final double SPEED = 5.0;
    private double dx = SPEED;
    private double dy = SPEED;
    private static double radius = 5;

    public Meteor(double x, double y, double radius) {
        super(x, y, radius, Color.RED);
    }

    public void move(double width, double height) {
        setCenterX(getCenterX() + dx);
        setCenterY(getCenterY() + dy);
        if (getCenterX() + radius > width || getCenterX() - radius < 0) {
            dx = -dx;
        }
        if (getCenterY() + radius > height || getCenterY() - radius < 0) {
            dy = -dy;
        }
    }
}