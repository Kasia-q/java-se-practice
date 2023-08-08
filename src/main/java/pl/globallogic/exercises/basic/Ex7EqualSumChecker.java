package pl.globallogic.exercises.basic;

public class Ex7EqualSumChecker {
    public static void main(String[] args){
        System.out.println(hasEqualSum(1,1,1));
        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,-1,0));
        System.out.println(hasEqualSum(2,2,4));

    }
    private static boolean hasEqualSum(int num1, int num2, int sum){
        if (num1 + num2 == sum) {
            return true;
        }

        return false;
    }
}
