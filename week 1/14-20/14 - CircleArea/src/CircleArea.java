import java.util.*;
import java.lang.Math;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble(), area;
        area = Math.PI * Math.pow(radius, 2) ;
        System.out.println("Circle Area is " + area);
    }
}
