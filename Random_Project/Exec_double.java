public class Exec_double {
    public static void main(String[] args) {
        System.out.println(totalDistance(70.0, 7.0, 0, false));
        System.out.println(totalDistance(36.1, 8.6, 3, true));
    }

    public static double totalDistance(double fuel, double fuelUsage, int passengers, boolean airConditioner) {
        if (passengers >0) {
        fuelUsage +=passengers*(fuelUsage*0.05);
        }
        if (airConditioner) {
            fuelUsage +=(fuelUsage*0.1);
        }
        return 100*(fuel/fuelUsage);
    }
}
