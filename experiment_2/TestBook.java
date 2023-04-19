class TestBook {
    public static void main(String[] args) {
        Book new_book = new Book("9787121155352", "C++ primer", "Stanley Lippman", "people post", 60);
        System.out.println("The book information is : \n" + new_book);
        new_book.setPrice(100);
        System.out.println("After modify : \n" + new_book);
    }
}