package pl.globallogic.exercises.basic;

public class Ex12PlayingCat {
    public static void main(String[] args){
        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(true,35));
        System.out.println(isCatPlaying(true,45));

    }

    private static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            return temperature >= 25 && temperature <= 45;
        } else{
            return temperature >= 25 && temperature <= 35;
        }
    }
}
