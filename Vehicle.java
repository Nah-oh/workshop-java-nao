public class Vehicle {
    
    protected String brand;
    protected String model;
    protected int year;
    protected int weight;
    protected int wheels;

    public Vehicle (String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
    
    public void accelerate() {
        System.out.println("I'm putting the pedal to the metal");
    }

    public void brake() {
        System.out.println("Woah! Slow down boy!");
    }

    public void describe() {
        System.out.println("I'm a " + brand + " " + model + " made in " + year);
    }

    public String getBrand(){return brand;}
    public String getModel(){return model;}
    public int getYear(){return year;}
    public int getWeight(){return weight;}
    public int getWheels(){return wheels;}

    public void setBrand(String b) {
        brand = b;
    }
    public void setModel(String m) {
        model = m;
    }
    public void setYear(int y) {
        year = y;
    }
    public void setWeight(int w) {
        weight = w;
    }
    public void setWheels(int w) {
        wheels = w;
    }
}
