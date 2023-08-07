package pl.globallogic.exercises.basic;

public class Ex3MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        int megabytes = kiloBytes / 1024;

        int remainingKilobytes = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid value");
            return;
        }

        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
    }


}
