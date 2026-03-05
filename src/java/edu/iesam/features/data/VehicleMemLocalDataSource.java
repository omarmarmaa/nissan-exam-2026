package java.edu.iesam.features.data;

import java.util.ArrayList;
import java.util.Objects;

public class VehicleMemLocalDataSource {

    private ArrayList<VehicleData> storage = new ArrayList<>();

    public ArrayList<VehicleData> findAll() {
        return storage;
    }

    public void save(VehicleData vehicle) {
        storage.add(vehicle);
    }

    public void delete(String vehicleId) {
        storage.removeIf(vehicle -> Objects.equals(vehicle.getId(), vehicleId));
    }
}
