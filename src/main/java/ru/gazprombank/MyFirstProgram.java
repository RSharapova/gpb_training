package ru.gazprombank;

import java.awt.*;

public class MyFirstProgram {

  public static void main(String[] args) {
    Point p1 = new Point(1, 3);
    Point p2 = new Point(8, 6);
    Point p3 = new Point(10, 9);
    System.out.println("Расстояние между точками p1 (" + p1.x + "," + p1.y + ") и p2 (" + p2.x + "," + p2.y + ") = " + distance(p1, p2) + " см.");
    System.out.println("Расстояние между точками p1 (" + p2.x + "," + p2.y + ") и p2 (" + p3.x + "," + p3.y + ") = " + Point.distance(p2, p3) + " см.");
  }

  public static double distance(Point p1, Point p2) {
    return Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
  }
}