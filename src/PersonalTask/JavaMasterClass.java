package PersonalTask;

/*TIP: In the method printConversion, call the method toMilesPerHour instead of duplicating the code.

        NOTE: All methods should be defined as public static like we have been doing so far in the course.

        NOTE: 1 mile per hour is 1.609 kilometers per hour

        NOTE: Do not add a main method to the solution code.

 */

public class JavaMasterClass {

    public static void main(String[] args) {

        int kilo = 5000;

        printMegaBytesAndKiloBytes(kilo);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double toMiles = 1.609;

        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / toMiles);


    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }

    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if(kiloBytes < 0 ){
            System.out.println("Invalid Value");
        }
        else{
            int mb = Math.round(kiloBytes/1024);
            int remKb = kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + mb + " MB and "+remKb +" KB");
        }
    }
}
