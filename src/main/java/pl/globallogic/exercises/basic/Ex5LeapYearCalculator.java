package pl.globallogic.exercises.basic;

public class Ex5LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1700));
        System.out.println(isLeapYear(1800));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2200));
        System.out.println(isLeapYear(2300));
        System.out.println(isLeapYear(2500));
        System.out.println(isLeapYear(2600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(-1600));


    }
    private static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;

    }
}
