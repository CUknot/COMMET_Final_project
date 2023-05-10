package Application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Pane.RootPane;
import entity.Spaceship;

public class Main extends Application {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {
    	RootPane root = new RootPane();
    	Spaceship spaceship = root.getSpaceship();
    	Scene scene = new Scene(root, WIDTH, HEIGHT);
        scene.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W:
                	spaceship.moveUp();
                    break;
                case A:
                	spaceship.moveLeft();
                    break;
                case S:
                	spaceship.moveDown();
                    break;
                case D:
                	spaceship.moveRight();
                    break;
                case SPACE:
                	spaceship.shoot();
                    break;
                default:
                    break;
            }
        });
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

	public static int getWidth() {
		return WIDTH;
	}

	public static int getHeight() {
		return HEIGHT;
	}
}
