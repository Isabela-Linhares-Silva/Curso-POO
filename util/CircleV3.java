package util;

public class CircleV3 {
    public static final double PI = 3.14;// é estatica pq é uma constante que independe de qualquer objeto do tipo Circle

    public static double circumference(double radius) { // tambem é estatica pq pode ser calculada independente de objeto
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    } 
}
