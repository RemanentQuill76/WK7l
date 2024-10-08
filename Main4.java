public class Main4 {
    public static void main(String[] args){
        paperBook readBook = new paperBook();
        audioBook loudBook = new audioBook();
        eBook visualBook = new eBook();
        PDF pdf = new PDF();
        EPUB epub = new EPUB();
        text Text = new text();

        readBook.typeOfBook();
        loudBook.typeOfBook();
        visualBook.typeOfBook();

        readBook.pageLength(25);
        visualBook.setBrightness(50);
        loudBook.setReadSpeed(1.5);

        pdf.formatOfBook();
        epub.formatOfBook();
        Text.formatOfBook();
    }
}
