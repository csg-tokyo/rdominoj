package select;

public class IntCell {
    private int value = 0;
    public void setValue(int v) {
        System.out.println("setValue beginning " + value);
        value = v;
        System.out.println("setValue end " + value);
    }
    public int getValue() {
        return value;
    }
    public void print() {
        System.out.println("print " + getValue());
    }
    public static void main(String[] args) {
        IntCell c = new IntCell();
        c.setValue(1);

        System.out.println("{c.print} ^= c.print();");
        {c.print} ^= c.print();
        c.setValue(2);

        System.out.println("{c.print} += c.print();");
        {c.print} += c.print();
        c.setValue(3);
    }
}
