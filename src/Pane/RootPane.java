package Pane;

import Application.MoveBulletThread;
import entity.Spaceship;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class RootPane extends BorderPane{
    
	private final Spaceship spaceship = new Spaceship(400, 500);
    private int healthValue = 100;
    private int score = 0;
    
    public static final Pane displaypane = new Pane();
    
    public RootPane() {
		Label healthLabel = new Label("Health: " + healthValue);
	    Label scoreLabel = new Label("Score: " + score);
	    this.setTop(healthLabel);
	    this.setRight(scoreLabel);
	    this.setCenter(displaypane);
	    this.getChildren().add(spaceship);
	    MoveBulletThread moveBulletThread = new MoveBulletThread();
	    moveBulletThread.start();
    }

	public Spaceship getSpaceship() {
		return spaceship;
	}

	public static Pane getDisplaypane() {
		return displaypane;
	}
    
}
