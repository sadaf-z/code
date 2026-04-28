class Books {
    String author;
    String title;
    double price;
    String publisher;
    int stock;

    Books(String author, String title, double price, String publisher, int stock) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.publisher = publisher;
        this.stock = stock;
    }

    void display() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
        System.out.println("Publisher  : " + publisher);
        System.out.println("Stock      : " + stock);
        System.out.println("----------------------------");
    }
}


public class BookStoreDemo {
    public static void main(String[] args) {

        Books[] bookList = new Books[10];

        bookList[0] = new Books("J.K. Rowling", "Harry Potter", 500, "Bloomsbury", 20);
        bookList[1] = new Books("George Orwell", "1984", 350, "Secker & Warburg", 15);
        bookList[2] = new Books("J.R.R. Tolkien", "The Hobbit", 450, "Allen & Unwin", 10);
        bookList[3] = new Books("Dan Brown", "Inferno", 600, "Doubleday", 12);
        bookList[4] = new Books("Paulo Coelho", "The Alchemist", 300, "HarperOne", 25);
        bookList[5] = new Books("Chetan Bhagat", "2 States", 250, "Rupa", 18);
        bookList[6] = new Books("Stephen King", "It", 700, "Viking", 8);
        bookList[7] = new Books("Agatha Christie", "Murder on the Orient Express", 400, "Collins Crime Club", 14);
        bookList[8] = new Books("Rick Riordan", "Percy Jackson", 550, "Disney-Hyperion", 16);
        bookList[9] = new Books("Jane Austen", "Pride and Prejudice", 380, "T. Egerton", 11);

        for (int i = 0; i < bookList.length; i++) {
            bookList[i].display();
        }
    }
}
