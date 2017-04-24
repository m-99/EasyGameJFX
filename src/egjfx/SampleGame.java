package egjfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SampleGame extends Application {

    public void start(Stage stage) {
        Canvas canvas = new Canvas(800, 600);
        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);

        GraphicsContext gc = canvas.getGraphicsContext2D();

        Image bottle = new Image("https://www.gstatic.com/webp/gallery3/2.sm.png");
        gc.drawImage(bottle, 0, 0);

        stage.setTitle("My Game");
        stage.setScene(scene);
        stage.show();
    }
}