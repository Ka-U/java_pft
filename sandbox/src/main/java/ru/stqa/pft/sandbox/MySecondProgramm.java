package ru.stqa.pft.sandbox;

public class MySecondProgramm {

    public static void main(String[] args) {
        Point p1 = new Point(5, 6);
        Point p2 = new Point(4, 5);
        String msg = String.format("Расстояние между двумя точками с координатами %s %s и %s %s равно %s",
                p1.x, p1.y, p2.x, p2.y, p1.distance(p2));
        System.out.println(msg);
    }
}
