class Reader {
    int readerID;
    String readerName;
    String readerPwd;
    double balance;
    String note = "\nReader action result prompt : ";
    static int nextReaderID;
    static {
        nextReaderID = 10001;
    }
    Reader() {
        this.readerID = ++nextReaderID;
        this.readerName = "";
        this.readerPwd = "666666";
        this.balance = 0;
    }
    Reader(String name) {
        this();
        this.readerName = name;
    }
    int getReaderID() {
        return this.readerID;
    }
    void setReaderName(String name) {
        this.readerName = name;
    }
    String getReaderName() {
        return this.readerName;
    }
    void setReaderPwd(String new_pwd) {
        if (new_pwd.length() < 6) {
            this.note = "The password is too short";
        } else {
            this.readerPwd = new_pwd;
            this.note = "Successful changed the password"; 
        }
    }
    String getReaderPwd() {
        return this.readerPwd;
    }
    void setBalance(double moreMoney) {
        if (moreMoney < 0) {
            this.note = "The top-up cannot be negative";
        } else {
            this.balance += moreMoney;
            this.note = "Successful recharge";
        }
    }
    double getBalance() {
        return this.balance;
    }
    public String toString() {
        return "Reader number : " + this.readerID + "\tReader name : " + this.readerName + "\tReader password : " + this.readerPwd + "\tReader Balance : " + this.balance;
    }
}