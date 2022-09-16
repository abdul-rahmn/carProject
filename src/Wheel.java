import java.util.ArrayList;

public class Wheel {
    private int id;
    private int numberOfScrews;
    private int thikness;
    private String type;
    private int carId;

    public Wheel(int id, int numberOfScrews, int thikness, String type, int carId) {
        this.id = id;
        this.numberOfScrews = numberOfScrews;
        this.thikness = thikness;
        this.type = type;
        this.carId = carId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfScrews() {
        return numberOfScrews;
    }

    public void setNumberOfScrews(int numberOfScrews) {
        this.numberOfScrews = numberOfScrews;
    }

    public int getThikness() {
        return thikness;
    }

    public void setThikness(int thikness) {
        this.thikness = thikness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    ///

    static void createWheel(ArrayList<Wheel> wheels,int id, int numberOfScrews, int thikness, String type, int carId) {
        wheels.add(new Wheel(id, numberOfScrews, thikness, type, carId));
    }

    public void readWheel() {
        System.out.println("ID:" + getId() + " , " + "Number Of Screws: " + getNumberOfScrews() + " , "
                + "Thikness: " + getThikness() + " , " + "Type: " + getType() + " , "
                + "Car ID: " + getCarId());
    }    
}
