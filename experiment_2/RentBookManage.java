import java.util.*;
class RentBookManage {
    static final int    deadTime = 10;
    double              normalRent = 0.1;
    double              delayRent = 1.0;
    int                 rentDays;
    double              rent;
    RentBook            rentedBook;
    VIPReader           renter;

    LinkedList<RentBook>    bookList;
    ArrayList<VIPReader>    readerList;
    ArrayList<String>       rentList;
    int                     current_book;

    RentBookManage() {
        this.bookList = new LinkedList<RentBook>();
        this.readerList = new ArrayList<VIPReader>();
        this.rentList = new ArrayList<String>();
    }

    static double getDeadTime() {
        return deadTime;
    }
    void setNormalRent(double newNR) {
        this.normalRent = newNR;
    }
    double getNormalRent() {
        return this.normalRent;
    }
    void setDelayRent(double newDR) {
        this.delayRent = newDR;
    }
    double getDelayRent() {
        return this.delayRent;
    }

    void addBook(String isbn, String name, String author, String publisher, double price, String no) {
        this.bookList.add(new RentBook(isbn, name, author, publisher, price, no));
    }
    void addBook(int i, String isbn, String name, String author, String publisher, double price, String no) {
        this.bookList.add(i, new RentBook(isbn, name, author, publisher, price, no));
    }
    void searchBook(String bookName) {
        boolean flag = false;
        for (int j = 0; j < this.bookList.size(); ++j) {
            if (this.bookList.get(j).getBookName().equals(bookName)) {
                System.out.println(this.bookList.get(j));
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Can't search " + bookName);
        }
    }
    void editBook(String bookName, double b_price) {
        for (int j = 0; j < this.bookList.size(); ++j) {
            if (this.bookList.get(j).getBookName().equals(bookName)) {
                this.bookList.get(j).setPrice(b_price);
                System.out.println(bookList.get(j));
            }
        }
    }
    void deleteBook(String bookName) {
        for (int j = 0; j < this.bookList.size(); ++j) {
            if (this.bookList.get(j).getBookName().equals(bookName)) {
                this.bookList.remove(j);
                System.out.println("Deleted successfully");
            }
        }
    }
    void displayBook() {
        for (RentBook b : this.bookList) {
            System.out.println(b);
        }
    }

    void addReader(String name, String grade) {
        this.readerList.add(new VIPReader(name, grade));
    }
    void displayReader() {
        for (VIPReader r : this.readerList) {
            System.out.println(r);
        }
    }
    double setRent() {
        if (rentDays <= deadTime) {
            this.rent = this.rentDays * this.normalRent * this.renter.getPercent();
        } else {
            this.rent = ((this.rentDays - deadTime) * this.delayRent + deadTime * normalRent) * this.renter.getPercent();
        }
        return this.rent;
    }
    boolean renting() {
        setRent();
        if (this.renter.payRent(rent)) {
            System.out.println(this.renter.getReaderName() + " Pay rent : " + this.rent + " Successfully");
            return true;
        } else {
            System.out.println(this.renter.getReaderName() + "'account balance : " + this.rent + "insufficient payment of rent : " + this.rent);
            return false;
        }
    }
    void rentBook(RentBook bk, VIPReader rd, int days) {
        this.rentedBook = bk;
        this.renter = rd;
        this.rentDays = days;
        if (renting()) {
            this.renter.setBonusPoints(this.rentDays);
            this.rentList.add(renter.getReaderName() + " The rent book is : " + rentedBook.getBookName() + " | " + rentedBook.getBookNo() + " The account balance is : " + renter.getBalance() + " The bonus point is " + renter.getBonusPoints());
        }
    }
    void displayRentInfo() {
        for (String br : this.rentList) {
            System.out.println(br);
        }
    }

    public static void main(String[] args) {
        System.out.println("RentBookManage operational status as follow");
        // RentBookManage bm = new RentBookManage();
    }
}