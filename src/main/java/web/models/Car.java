package web.models;

public class Car {
    private int id;
    private String model;
    private int yearOfRelease;

    public Car(int id, String model, int yearOfRelease) {
        this.id = id;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Car: " + id + ", " + model + ", " + yearOfRelease;
    }
}
