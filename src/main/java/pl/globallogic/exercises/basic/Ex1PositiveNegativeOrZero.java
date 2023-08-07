package pl.globallogic.exercises.basic;

public class Ex1PositiveNegativeOrZero {
    public static void CheckNum(int num) {
        if( num < 0 ) System.out.println("The number is negative");
        else if (num > 0) System.out.println("The number is positive");
        else System.out.println("The number is equal to 0");
    }

    public static void main(String[] args) {
        CheckNum(2);
        CheckNum(0);
        CheckNum(-3);
    }
}
