package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Particle {
  protected Vec2 pos;
  protected Vec2 vel;
  protected double sz;
  protected Color col;

  public Particle(Vec2 initPos, Vec2 initVel) {
    pos = initPos;
    vel = initVel;
    sz = 10;
    col = Color.rgb(30,50,220, 1);
  }
  
  public void display(GraphicsContext g) {
    g.setFill(col);
    g.fillOval(pos.getX(), pos.getY(), sz, sz);
  }
  public void update() {
    pos.addThis(vel);
  }
  public void addForce(Vec2 force) {
    vel.addThis(force);
  }

}
