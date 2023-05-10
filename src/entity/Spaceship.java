package entity;



import Pane.RootPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

public class Spaceship extends Polygon {
    private static final double MOVE_DELTA = 5.0;
    private static final double[] SHAPE = { 0, 40, 20, 0, 40, 40 };

    private double health = 100.0;
    public Spaceship(double x, double y) {
        super(SHAPE);
        setTranslateX(x);
        setTranslateY(y);
        setFill(Color.BLUE);
    }

    public void moveLeft() {
    	double nextX = getTranslateX() - MOVE_DELTA;
        if (nextX >= 0) {
            setTranslateX(nextX);
        }
    }

    public void moveRight() {
    	double nextX = getTranslateX() + MOVE_DELTA;
        if (nextX >= 0) {
            setTranslateX(nextX);
        }
    }

    public void moveUp() {
    	double nextY = getTranslateY() - MOVE_DELTA;
        if (nextY >= 0) {
            setTranslateY(nextY);
        }
    }

    public void moveDown() {
    	double nextY = getTranslateY() + MOVE_DELTA;
        if (nextY >= 0) {
            setTranslateY(nextY);
        }
    }

    public void takeDamage(double amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println("Game over!");
            // Handle game over logic here
        }
    }

    public void shoot() {
        Bullet bullet = new Bullet(getTranslateX() + 20, getTranslateY());
        // Add bullet to game world or scene graph here
        RootPane.getDisplaypane().getChildren().add(bullet);
        
    }
    
    public double getHealth() {
        return health;
    }


}
