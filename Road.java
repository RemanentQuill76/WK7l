public class Road {
    public static void main(String[] args) {
        Vehicle v  = new Car();
        Vehicle b = new Bicycle();
        v.start();
        v.honk();
        b.start();
        b.honk();
    }
}
