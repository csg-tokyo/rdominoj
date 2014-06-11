package increase;

public class Test {
    private int count = 0;
    public void set(int c) {
        count = c;
    }
    public void print() {
        System.out.println(count);
        count += 1;
    }
    public static void main(String[] args) {
        Test t = new Test();
        {t.print} += t.print();
        t.set(1);
    }
}
