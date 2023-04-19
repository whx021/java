class RentBook extends Book {
    String bookNo;
    boolean state;
    RentBook(String b_isbn, String b_name, String b_author, String b_publisher, double b_price, String b_no) {
        super(b_isbn, b_name, b_author, b_publisher, b_price);
        this.bookNo = b_no;
        this.state = true;
    }
    void setBookNo(String b_no) {
        this.bookNo = b_no;
    }
    String getBookNo() {
        return this.bookNo;
    }
    public void setState(boolean b_state) {
        this.state = b_state;
    }
    public boolean getState() {
        return this.state;
    }
    public String toString() {
        return super.toString() + "\t book number : " + getBookNo() + "whether it can be rent or not : " + getState();
    }
}