package pl.globallogic.exercises.basic;

public class Ex6DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }

    private static boolean areEqualByThreeDecimalPlaces(double baseNum, double compNum) {
        if(baseNum < 0 && compNum < 0){
            baseNum = Math.ceil(baseNum * 1000) / 1000;
            compNum = Math.ceil(compNum * 1000) / 1000;
            return baseNum == compNum;
        }
        if(baseNum > 0 && compNum > 0){
            baseNum = Math.floor(baseNum * 1000) / 1000;
            compNum = Math.floor(compNum * 1000) / 1000;
            return baseNum == compNum;
        }
        return baseNum == compNum;

    }
}
