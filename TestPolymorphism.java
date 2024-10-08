public class TestPolymorphism {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();
        ((Animal) a).sound();

        a = (Animal) new Cat();
        a.sound();
        //((Dog) a).sound();

	//Modify step
	Animal b;
	b = new Bird();
	b.sound();
    }
}
