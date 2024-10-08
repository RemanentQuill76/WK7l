public class eBook extends Book {
    private int brightness = 100;
    
    public void typeOfBook(){
        System.out.println("Your book is an eBook");
    }

    public void setBrightness(int newBrightness) {
        this.brightness = newBrightness;
        System.out.println("Your new brightness is " + brightness);
    }
}
