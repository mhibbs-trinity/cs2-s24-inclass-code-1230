package cs2.particles;

import javafx.scene.paint.Color;

public class GradientColor implements ColorPattern {
  private Color start;
  private Color stop;
  private double frac;

  public GradientColor(Color begin, Color end) {
    start = begin; stop = end;
  }

  public Color getColor() {
    frac += 0.03;
    frac %= 1;
    return start.interpolate(stop, frac);
  }
  
}
