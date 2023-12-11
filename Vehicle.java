public class Vehicle {
    
    String brand;
    String model;
    int year;
    int weight;
    int wheels;

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
}
