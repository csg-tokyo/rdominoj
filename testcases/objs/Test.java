package objs;
import common.IntCell;

public class Test {
    public static void print() {
        System.out.println("print");
    }
    public static void main(String[] args) {
        IntCell c1 = new IntCell("c1");
        IntCell c2 = new IntCell("c2");

        System.out.println("{c1.print} += c1.print();");
        {c1.print} += c1.print();
        c1.setValue(1);
        c2.setValue(2);

        System.out.println("{c1.print} += c2.print();");
        {c1.print} += c2.print();
        c1.setValue(3);
        c2.setValue(4);

        System.out.println("{c1.print} -= c2.print();");
        {c1.print} -= c2.print();
        c1.setValue(5);
        c2.setValue(6);
    }
}
