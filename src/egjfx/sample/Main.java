package egjfx.sample;

import javafx.application.Application;
import egjfx.animation.FrameHandler;
import egjfx.sprite.Sprite;
import egjfx.window.Window;

public class Main {
    public static void main(String[] args) {
        Sprite sprite = new Sprite();
        sprite.addFrameHandler(new FrameHandler() {
            @Override
            public void runPerTick(long now) {
                sprite.translateX(1);
                System.out.println("RunPerTick");
                System.out.println(sprite.getNode().translateXProperty());
            }
        });
        Window.addSprite(sprite);
        System.out.println("Launching Application");
        Application.launch(Window.class,args);
    }
}
