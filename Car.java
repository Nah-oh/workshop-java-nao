public class Car extends Vehicle {
    

    public Car (String b, String m, int y, int wght, int whls) {
        super(b, m, y);
        weight = wght;
        wheels = whls;
    }

    public void describe() {
        super.describe();
        System.out.println("I'm a Car, I weight " + weight + " and I have " + wheels + " wheels.");
    }

    public void accelerate(String onomatopeia) {
        System.out.println("My " + brand + " goes like this : " + onomatopeia);
    }
}
