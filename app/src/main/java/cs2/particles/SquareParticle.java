package cs2.particles;

import cs2.util.Vec2;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SquareParticle extends Particle {
  public SquareParticle(Vec2 ip, Vec2 iv) {
    super(ip,iv);
    col = Color.RED;
  }

  @Override
  public void display(GraphicsContext g) {
    g.setFill(col);
    g.fillRect(pos.getX(), pos.getY(), sz, sz);
  }
}
