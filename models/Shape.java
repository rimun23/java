
package models;
import models.Point;
import java.util.ArrayList;
public class Shape {
    private final ArrayList<Point> points;
    public Shape(){
        this.points = new ArrayList<>();
    }
    // addPoint(Point) - adds to the container
    public void addPoint(Point p){
        points.add(p);
    }
    public int size(){
        return points.size();
    }

    public double calculatePerimeter(){
        if(points.size() <= 1) return 0.0;
        double sum = 0.0;
        for(int i = 0; i<points.size()-1; i++){
            sum += points.get(i).distanceTo(points.get(i+1));
        }
        sum += points.get(points.size() - 1).distanceTo(points.get(0));
        return sum;
    }
    // calculatePerimeter()

    public double getAverageSide(){
        if(points.size() <= 1){
            return 0.0;
        }
        return calculatePerimeter() / points.size();
    }
    // getAverageSide()

    public double getLongest(){
        double longest = 0.0;
        for(int i = 0; i<points.size()-1; i++){
            if(points.get(i).distanceTo(points.get(i+1)) > longest){
                longest = points.get(i).distanceTo(points.get(i+1));
            }
        }
        return longest;
    }
    // getLongestSide()
}
