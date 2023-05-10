package entity;



import javafx.application.Platform;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

import Pane.RootPane;
public class Bullet extends Rectangle {

    private static final double SPEED = 2.0;
    private static final ArrayList<Bullet> bullets = new ArrayList<Bullet>();
    
    public Bullet(double x, double y) {
        super(x, y, 5, 10);
        setFill(Color.BLACK);
        bullets.add(this);
    }

    public void update() {
        setY(getY() - SPEED);
        checkOutOfBounds();
    }

    private void checkOutOfBounds() {
        if (getY() + getHeight() < 0) {
            removeFromParent();
        }
    }

    private void removeFromParent() {
    	Platform.runLater(() -> {
            RootPane.getDisplaypane().getChildren().remove(this);
        });
    }
    
    public static ArrayList<Bullet> getBullets() {
		return bullets;
	}
}

