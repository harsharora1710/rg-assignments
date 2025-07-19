interface Vehicle {
    // default method with implementation
    default void start() {
        System.out.println("Vehicle is starting...");
    }

    // static method with implementation
    static void stop() {
        System.out.println("Vehicle is stopping...");
    }
}


public class Question8 implements Vehicle{
    public static void main(String[] args) {
        Question8 car = new Question8();
        car.start();
        Vehicle.stop();
    }
}
