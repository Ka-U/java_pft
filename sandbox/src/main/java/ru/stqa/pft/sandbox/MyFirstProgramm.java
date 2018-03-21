package ru.stqa.pft.sandbox;

public class MyFirstProgramm {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alex");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p1 = new Point(5, 6);
    Point p2 = new Point(4, 5);
    String msg = String.format("Расстояние между двумя точками с координатами %s %s и %s %s равно %s",
              p1.x, p1.y, p2.x, p2.y, p1.distance(p2));
    System.out.println(msg);

  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!!!");
  }

  }