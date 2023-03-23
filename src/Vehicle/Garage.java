package Vehicle;

import java.util.Arrays;

public class Garage {
    private Vehicle[] vehicles = new Vehicle[4];


    public boolean spaceInGarage() {
        for (int i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                return true;
            }
        }
        return false;
    }

    public Vehicle checkSpace(int place) {
        return vehicles[place];
    }

    public void deleteVehicleFromSpace(int place) {
        if (place >= 0 && place <= vehicles.length) {
            vehicles[place] = null;
        } else {
            throw new IllegalArgumentException("Nie ma takiego miejsca");
        }
    }

    public void addVehicleToSpace(Vehicle vehicle, int place) {
        if (place > 0 && place <= vehicles.length) {
            if (vehicles[place] == null) {
                vehicles[place] = vehicle;
            } else {

                throw new IllegalArgumentException("To miejsce jest już zajęte");
            }
        }
    }
    public String showCarsInGarage(){
        return Arrays.toString(vehicles);
    }

    @Override
    public String toString() {
        return "Garage{" +
                "vehicles=" + Arrays.toString(vehicles) +
                '}';
    }
}
