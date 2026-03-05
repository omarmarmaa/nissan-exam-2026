package java.edu.iesam.features.domain;

public class Vehicle {
    String name;
    String model;
    String year;
    String id;

    public Vehicle(String name, String model, String year, String id) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
