package parameter;
import common.IntCell;

public class Outer {
    private String name = "";
    public Outer(String n) {
        name = n;
    }
    public void print(IntCell c) {
        System.out.println(name + ": print " + c.getValue());
    }
    public static void main(String[] args) {
        IntCell c = new IntCell("c");
        Outer o = new Outer("o");
        c.setValue(1);

        System.out.println("{o.print} += o.print();");
        {o.print} += o.print(c);
        c.setValue(2);
    }
}
