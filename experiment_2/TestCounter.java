public class TestCounter {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.count_value = 5;
        System.out.println("The initial value : " + c.count_value);
        c.increment();
        System.out.println("After increment : " + c.count_value);
        c.decrement();
        System.out.println("After decrement : " + c.count_value);
        c.reset();
        System.out.println("After reset : " + c.count_value);
    }
}