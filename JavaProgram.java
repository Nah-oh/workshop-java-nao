public class JavaProgram {

    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println("Exercice 1");
        Vehicle v = new Vehicle("Volkswagen", "Spirocco", 2008);
        Truck kun = new Truck("Scania", "Frostfire", 2022, 6000, 6);
        Car buggati = new Car("Ferrari", "Testarossa", 1984, 1656, 4);
        Motorcycle moto2julien = new Motorcycle("Kawasaki", "Ninja", 2013, 170, 2);
        v.describe();
        v.accelerate();
        System.out.println("------------------------------------");
        buggati.describe();
        System.out.println("------------------------------------");
        kun.describe();
        System.out.println("------------------------------------");
        moto2julien.describe();
        System.out.println("------------------------------------");
        buggati.accelerate("hyy--yèè");
        System.out.println();
        moto2julien.accelerate("niiiIIIooonnnnnn");
        System.out.println();
        kun.accelerate("UWUUUUUUUUUUUUUU");
        v.getBrand();
        System.out.println("------------------------------------");
    }
}
