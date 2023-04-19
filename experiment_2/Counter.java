class Counter {
    int count_value;
    int increment() {
        return ++count_value;
    }
    int decrement() {
        return --count_value;
    }
    void reset() {
        count_value = 0;
    }
}