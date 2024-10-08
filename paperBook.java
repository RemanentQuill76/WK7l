public class paperBook extends Book {
    public int pageLength;
    public void typeOfBook(){
        System.out.println("This book is a paperback book");
    }

    public void pageLength(int pages) {
        this.pageLength = pages;
        System.out.println("Your book is " + pageLength + " pages long.");
    }
}
