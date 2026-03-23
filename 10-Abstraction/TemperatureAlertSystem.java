import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {
        double temperature = 42.5;
        double threshold = 40.0;

        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        if (isHighTemperature.test(temperature)) {
            System.out.println("Alert! Temperature crossed the threshold.");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}