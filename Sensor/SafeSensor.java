package Sensor;

public class SafeSensor extends Sensor {

    private double max() {
        return 10;
    }

    public SafeSensor(double pressure) {
        super(pressure);

    }

    public SafeSensor(double maxPressure, double pressure) {
        super(pressure);
        maxPressure = getMax();

    }

    @Override
    public void setPressure(double pressure) {
        if (pressure > max()) {
//            return true;
        } else {
//            return false;
        }
    }

    public double getMax() {
        return max();
    }
}
