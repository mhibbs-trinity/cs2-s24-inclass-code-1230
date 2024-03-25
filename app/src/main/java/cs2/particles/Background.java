package cs2.particles;

import javafx.scene.canvas.GraphicsContext;

public class Background {
  private ColorPattern cp;
  public Background(ColorPattern pattern) {
    cp = pattern;
  }
  public void display(GraphicsContext g) {
    g.setFill(cp.getColor());
    g.fillRect(0,0, 1000,1000);
  }
}
