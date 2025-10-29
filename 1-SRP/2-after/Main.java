public class Main {
    public static void main(String[] args) {
        BookSRP bookSRP = new BookSRP("Les principes SOLID", "Etudiants de M1-GL", "Révision desprincipes SOLID");
        BookPrinter bookPrinter = new BookPrinter();
        BookSaver bookSaver = new BookSaver();
        BookBusinessLogic bookBusiness = new BookBusinessLogic();

        bookPrinter.printToScreen(bookSRP);
        bookPrinter.printToHTML(bookSRP);

        bookSaver.saveToDatabase(bookSRP);
        bookSaver.saveToFile(bookSRP, "Livres d'histoire");

        bookBusiness.emprunter(bookSRP, "Marcial");
        bookBusiness.autreService(bookSRP);
        }
}
