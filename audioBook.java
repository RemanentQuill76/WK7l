public class audioBook extends Book {
    private double readSpeed = 1;
    public void typeOfBook(){
        System.out.println("Your book is an audio book");
    }

    public void setReadSpeed (double newSpeed) {
        this.readSpeed = newSpeed;
        System.out.println("Your new speed is " + readSpeed + "x.");
    }
}
