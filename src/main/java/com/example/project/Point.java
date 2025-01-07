package com.example.project;
public class Point {
  private int x;
  private int y;
  
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
    /* IMPLEMENT ME */
    double distanceX = other.x - this.x;
    double distanceY = other.y - this.y;
    double distance = Math.sqrt(Math.pow(distanceX, 2) + Math.pow(distanceY, 2));
    return distance;
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
   /* IMPLEMENT ME */
   String out = "(" + x + ", " + y + ")";
   return out;
  }

  public int getX() {
    return x;

  }

  public int getY() {
    return y;

  }

  public void setPoint(int newX, int newY) {
    this.x = newX;
    this.y = newY;

  }
}
