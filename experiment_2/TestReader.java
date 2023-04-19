class TestReader {
    public static void main(String[] args) {
        System.out.println("Reader class operational situation as follow");
        Reader reader_1 = new Reader();
        System.out.println(reader_1);
        reader_1.setReaderName("Jerry");
        System.out.println(reader_1);

        Reader reader_2 = new Reader("Tom");
        System.out.println(reader_2);
        System.out.println(reader_2.note);
        
        reader_2.setReaderPwd("abc");
        System.out.println("\nsetReaderPwd(\"abc\")--" + reader_2.note);
        System.out.println(reader_2);

        reader_2.setReaderPwd("abc123");
        System.out.println(reader_2.note);
        System.out.println(reader_2);

        reader_2.setBalance(-50);
        System.out.println("\nsetBalance(-50)--" + reader_2.note);
        System.out.println(reader_2);

        reader_2.setBalance(28);
        System.out.println(reader_2.note);
        System.out.println(reader_2);
    }
}