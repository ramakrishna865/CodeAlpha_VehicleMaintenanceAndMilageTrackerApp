import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleApp {
    private List<Vehicle> vehicles;
    private Scanner scanner;

    public VehicleApp() {
        this.vehicles = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Add Maintenance Record");
            System.out.println("4. Update Mileage");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle name: ");
                    String vehicleName = scanner.nextLine();
                    vehicles.add(new Vehicle(vehicleName));
                    System.out.println("Vehicle added.");
                    break;
                case 2:
                    System.out.println("Vehicle List:");
                    for (int i = 0; i < vehicles.size(); i++) {
                        System.out.println((i + 1) + ". " + vehicles.get(i).getName());
                    }
                    break;
                case 3:
                    System.out.print("Enter vehicle index: ");
                    int vehicleIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (vehicleIndex >= 1 && vehicleIndex <= vehicles.size()) {
                        System.out.print("Enter maintenance record: ");
                        String maintenanceRecord = scanner.nextLine();
                        vehicles.get(vehicleIndex - 1).addMaintenanceRecord(maintenanceRecord);
                        System.out.println("Maintenance record added.");
                    } else {
                        System.out.println("Invalid vehicle index.");
                    }
                    break;
                case 4:
                    System.out.print("Enter vehicle index: ");
                    int mileageVehicleIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (mileageVehicleIndex >= 1 && mileageVehicleIndex <= vehicles.size()) {
                        System.out.print("Enter new mileage: ");
                        double newMileage = scanner.nextDouble();
                        vehicles.get(mileageVehicleIndex - 1).updateMileage(newMileage);
                        System.out.println("Mileage updated.");
                    } else {
                        System.out.println("Invalid vehicle index.");
                    }
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the application.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        VehicleApp app = new VehicleApp();
        app.run();
    }
}
