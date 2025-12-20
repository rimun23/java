import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("perimeter: " + shape.calculatePerimeter());
        System.out.println("Average side: " + shape.getAverageSide());
        System.out.println("Longest side: " + shape.getLongest());
    }

}
