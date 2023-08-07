package pl.globallogic.exercises.basic;

public class Ex2SpeedConverter {
//    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(kilometersPerHour : 1.5) == 1);
//        System.out.println(toMilesPerHour(kilometersPerHour : 10.25) == 6);
//        System.out.println(toMilesPerHour(kilometersPerHour : -5.6) == -1);
//    }


    private static String convertedSpeedMessage(double kilometersPerHour) {
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles < 0) {
            return "Invalid value";
        }
        return kilometersPerHour + " km/h = " + miles + " mi/h";
    }

    private static long toMilesPerHour(double kilometersPerHour){
        double conversionCoefficient = 1.609;
        if(kilometersPerHour < 0)
            return -1;
        return Math.round(kilometersPerHour / conversionCoefficient);
    }


}
