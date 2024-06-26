package cs2.particles;

import cs2.util.Vec2;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ParticleSystemApp extends Application {

  public static final Image img = new Image("file:smile.png");

  public void start(Stage primaryStage) {
    Canvas canva = new Canvas(600,600);
    Scene sc = new Scene(new StackPane(canva));
    primaryStage.setScene(sc);
    primaryStage.setTitle("Particles!");
    primaryStage.show();
    GraphicsContext g = canva.getGraphicsContext2D();

    //Particle p = new Particle(new Vec2(200,200), Vec2.random());
    ArrayList<ParticleSystem> ps = new ArrayList<ParticleSystem>();
    //new ParticleSystem(new Vec2(300,300));
    
    Background bg = new Background(new GradientColor(Color.BLACK, Color.AQUAMARINE));

    AnimationTimer timer = new AnimationTimer() {
      public void handle(long t) {
        //g.setFill(Color.WHITE);
        //g.fillRect(0,0, 600,600);

        bg.display(g);
        g.drawImage(img, 100, 100, 75,75);

        for(int i=0; i<ps.size(); i++) {
          ps.get(i).run(g);
          ps.get(i).addParticle();
          ps.get(i).addForce(new Vec2(0,0.3));
          ps.get(i).addForce(wind);
        }
      }
    };
    timer.start();

    canva.setOnMousePressed((MouseEvent e) -> {
      ParticleSystem newSystem = new ParticleSystem(new Vec2(e.getX(),e.getY()));
      ps.add(newSystem);
    });
    canva.setOnMouseMoved((MouseEvent e) -> {
      wind = new Vec2(e.getX() / 300 - 1, 0);
    });
  }
  
  Vec2 wind = new Vec2(0,0);
}
