class Car {
    public void start() {
        System.out.println("The Car's engine started.");
    }

    public void accelerate() {
        System.out.println("The car accelerating.");
    }

    public void changeGear() {
        System.out.println("The car changed the gear");
    }
}

class LuxuryCar extends Car {

    @Override
    public void changeGear() {
        System.out.println("The Luxury Car changed gear automatically");
    }

    public void openRoof() {
        System.out.println("The sunroof opened");
    }
}

public class OverrideExample2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();

        System.out.println("\n");

        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.accelerate();
        lc.changeGear();//Method overrided
        lc.openRoof();

        System.out.println("\n");

        //Dynamic Method Dispatch
        Car c2 = new LuxuryCar();
        c2.start();
        c2.accelerate();
        c2.changeGear();
    }
}
