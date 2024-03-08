package cs2.util;

public class Vec2 {
  private double x, y;

  public Vec2(double inx, double iny) {
    this.x = inx;
    this.y = iny;
  }

  public static Vec2 random(double scale) {
    return new Vec2(Math.random() * scale - scale/2, 
                    Math.random() * scale - scale/2);
  }

  public double getX() { return this.x; }
  public double getY() { return this.y; }

  public Vec2 add(Vec2 other) {
    return new Vec2(this.x + other.x, this.y + other.y);
  }
  public void addThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
  }

  public Vec2 clone() {
    return new Vec2(this.x, this.y);
  }


}
