package cs2.util;

public class Vec2 implements Comparable<Vec2> {
  private double x, y;

  public int compareTo(Vec2 other) {
    if(this.x < other.x) return -1;
    else if(this.x > other.x) return +1;
    else return 0;
  }

  public Vec2(double inx, double iny) {
    this.x = inx;
    this.y = iny;
  }

  public static Vec2 random(double scale) {
    return new Vec2(Math.random() * scale - scale/2, 
                    Math.random() * scale - scale/2);
  }

  @Override
  public String toString() {
    return "(" + this.x + "," + this.y + ")";
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

  @Override
  public Vec2 clone() {
    return new Vec2(this.x, this.y);
  }


}
