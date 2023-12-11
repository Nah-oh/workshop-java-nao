public class Truck extends Vehicle {
    

    public Truck (String b, String m, int y, int wght, int whls) {
        super(b, m, y);
        weight = wght;
        wheels = whls;
    }

    public void describe() {
        super.describe();
        System.out.println("I'm a Truck, I weight " + getWeight() + " and I have " + getWheels() + " wheels.");
    }

    public void accelerate(String onomatopeia) {
        System.out.println("My " + getBrand() + " goes like this : " + onomatopeia);
    }
}
