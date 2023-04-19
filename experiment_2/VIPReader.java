class VIPReader extends Reader {
    String readerGrade;
    double percent;
    int bonusPoints;
    VIPReader(String name, String grade) {
        super(name);
        this.readerGrade = grade;
        this.bonusPoints = 0;
        this.setPercent();
    }
    void setReaderGrade(String grade) {
        this.readerGrade = grade;
        this.setPercent();
    }
    String getReaderGrade() {
        return this.readerGrade;
    }
    void setPercent() {
        if (this.readerGrade.equals("VIP")) {
            this.percent = 0.8;
        } else if (this.readerGrade.equals("normal")) {
            this.percent = 0.9;
        } else {
            this.percent = 1;
        }
    }
    double getPercent() {
        return this.percent;
    }
    public void setBonusPoints(int point) {
        this.bonusPoints = point;
    }
    public double getBonusPoints() {
        return this.bonusPoints;
    }
    boolean payRent(double rent) {
        if (this.balance >= rent) {
            this.balance -= rent;
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return super.toString() + "\tThe identity is : " + this.readerGrade + "\tCurrent bonus points is : " + this.bonusPoints + "\tDiscount rate is : " + this.percent;
    }
}