import java.util.ArrayList;

public class Engin {
    private int id;
    private String type;
    private int maxSpeed;
    private int numberOfCylenders;
    private String country;
    private int carId;

    public Engin(int id, String type, int maxSpeed, int numberOfCylenders, String country, int carId) {
        this.id = id;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.numberOfCylenders = numberOfCylenders;
        this.country = country;
        this.carId = carId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getNumberOfCylenders() {
        return numberOfCylenders;
    }

    public void setNumberOfCylenders(int numberOfCylenders) {
        this.numberOfCylenders = numberOfCylenders;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    ///

    static void createEngin(ArrayList<Engin> engins, int id, String type, int maxSpeed, int numberOfCylenders,
            String country, int carId) {
        engins.add(new Engin(id, type, maxSpeed, numberOfCylenders, country, carId));
    }

    public void readEngin() {
        System.out.println("ID:" + getId() + " , " + "Type: " + getType() + " , "
                + "Max Speed: " + getMaxSpeed() + " , " + "Number Of Cylenders: " + getNumberOfCylenders() + " , "
                + "Country: " + getCountry() + " , " + "Car ID: " + getCarId());
    }
}
