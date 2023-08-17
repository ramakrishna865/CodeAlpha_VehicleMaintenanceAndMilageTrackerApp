import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String name;
    private double mileage;
    private List<String> maintenanceHistory;

    public Vehicle(String name) {
        this.name = name;
        this.mileage = 0;
        this.maintenanceHistory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getMileage() {
        return mileage;
    }

    public void updateMileage(double newMileage) {
        mileage = newMileage;
    }

    public void addMaintenanceRecord(String record) {
        maintenanceHistory.add(record);
    }

    public List<String> getMaintenanceHistory() {
        return maintenanceHistory;
    }
}
