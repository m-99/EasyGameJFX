package egjfx.sprite;

import javafx.scene.Node;
import javafx.scene.shape.Rectangle;
import egjfx.animation.FrameHandler;
import javafx.scene.image.Image;

public class Sprite {
    private Image image;
    private double positionX;
    private double positionY;
    private double velocityX;
    private double velocityY;
    private double width;
    private double height;

    public Sprite(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Sprite() {
        this(0.0, 0.0);
    }

    public void setImage(Image image) {
        this.image = image;
        width = image.getWidth();
        height = image.getHeight();
    }

    public void setImage(String filepath) {
        Image image = new Image(filepath);
        setImage(image);
    }

    public void setPosition(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void setVelocity(double velocityX, double velocityY) {
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    public void addVelocity(double velocityX, double velocityY) {
        this.velocityX += velocityX;
        this.velocityY += velocityY;
    }
    
}
