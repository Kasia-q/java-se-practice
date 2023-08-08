package pl.globallogic.exercises.basic;

public class Ex9AreaCalculator {
    public static void main(String[] args) {
        System.out.println(Area(5.0));
        System.out.println(Area(-1));
        System.out.println(Area(5.0, 4.0));
        System.out.println(Area(-1.0, 4.0));

    }

    private static double Area(double radius){
        if(radius < 0) return -1.0;
        return radius * radius * Math.PI;
    }

    private static double Area(double x, double y){
        if(x < 0 || y < 0) return -1.0;
        return x * y;
    }
}
