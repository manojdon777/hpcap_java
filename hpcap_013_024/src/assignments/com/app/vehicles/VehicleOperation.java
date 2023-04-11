package assignments.com.app.vehicles;

import assignments.com.app.vehicles.exception.DuplicateVehicleException;

public class VehicleOperation {
    private Vehicle[] vehicleArray = new Vehicle[5];
    private int top = -1;

    private void addVehicle(Vehicle vehicle){
        if (top == -1) {
            vehicleArray[++top] = vehicle;
        }
        else{
            try{
                for(int i = 0; i <= top; i++) {
                    if (vehicle.equals(vehicleArray[i])) {
                        throw new DuplicateVehicleException("Duplicate vehicle found!!");
                    }
                    else{
                        vehicleArray[++top] = vehicle;
                        break;
                    }
                }
            }
            catch(DuplicateVehicleException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public void printVehicleDetails(){
        for(int i=0; i<=top; i++){
            System.out.println(vehicleArray[i]);
        }
    }
}
