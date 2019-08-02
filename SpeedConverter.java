public class SpeedConverter {


    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }

    }


    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            double milesPerHour = toMilesPerHour(kilometersPerHour);


            System.out.println(kilometersPerHour + " km/hr = " + milesPerHour + " mi/hr");
        }


    }

    public static void main(String[] args) {
        long milesPerHour = toMilesPerHour(10.5);
        System.out.println("mi/hr = " + toMilesPerHour(10.5));
        printConversion(10.5);
    }
}