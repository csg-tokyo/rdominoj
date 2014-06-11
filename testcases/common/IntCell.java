package common;

public class IntCell {
    private String name = "";
    private int value = 0;
    public IntCell(String n) {
        name = n;
    }
    public void setValue(int v) {
        System.out.println(name + ": setValue " + v);
        value = v;
    }
    public int getValue() {
        return value;
    }
    public void print() {
        System.out.println(name + ": print " + getValue());
    }
    public static void main(String[] args) {
        IntCell c = new IntCell("c");
        c.setValue(1);

        System.out.println("{c.print} += c.print();");
        {c.print} += c.print();
        c.setValue(2);
        c.setValue(3);

        System.out.println("{c.print} -= c.print();");
        {c.print} -= c.print();
        c.setValue(4);

        System.out.println("{c.print} ^= c.print();");
        {c.print} ^= c.print();
        c.setValue(5);

        System.out.println("{c.print} += c.print();");
        {c.print} += c.print();
        c.setValue(6);

        System.out.println("{c.print} -= c.print();");
        {c.print} -= c.print();
        c.setValue(7);

        System.out.println("{c.print} = c.print();");
        c.setValue(8);
    }
}
