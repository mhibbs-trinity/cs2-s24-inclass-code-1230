package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Particle {
  protected Vec2 pos;
  protected Vec2 vel;
  protected double sz;
  protected Color col;
  protected ColorPattern cp;

  public Particle(Vec2 initPos, Vec2 initVel) {
    pos = initPos;
    vel = initVel;
    sz = 10;
    col = Color.rgb(30,50,220, 1);
    //cp = new SolidColor();
    //cp = new RainbowColor();
    cp = new GradientColor(Color.RED, Color.BLUE);
  }
  
  public abstract void display(GraphicsContext g);

  public void update() {
    col = cp.getColor();
    pos.addThis(vel);
  }
  public void addForce(Vec2 force) {
    vel.addThis(force);
  }

}
