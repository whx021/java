class Book {
    String  ISBN;
    String  bookName;
    String  author;
    String  publisher;
    double  price;
    Book(String b_isbn, String b_name, String b_author, String b_publisher, double b_price) {
        this.ISBN = b_isbn;
        this.bookName = b_name;
        this.author = b_author;
        this.publisher = b_publisher;
        this.price = b_price;
    }
    String getISBN() {
        return this.ISBN;
    }
    String getBookName() {
        return this.bookName;
    }
    String getAuthor() {
        return this.author;
    }
    String getPublisher() {
        return this.publisher;
    }
    double getPrice() {
        return this.price;
    }
    void setPrice(double newPrice) {
        this.price = newPrice;
    }
    public String toString() {
        return getISBN() + " | " + getBookName() + " | " + getAuthor() + " | " + getPublisher() + " | " + getPrice();
    }
}