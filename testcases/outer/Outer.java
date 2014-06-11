package outer;

public class Outer {
    private String name = "";
    private IntCell cell = null;
    public Outer(String n, IntCell c) {
        name = n;
        cell = c;
    }
    public void print1() {
        System.out.println(name + ": print1 " + cell.value);
    }
    public void print2() {
        System.out.println(name + ": print2 " + cell.getValue());
    }
    public static void main(String[] args) {
        IntCell c = new IntCell("c");
        Outer o = new Outer("o", c);
        c.setValue(1);

        System.out.println("{o.print1} += o.print1();");
        {o.print1} += o.print1();
        c.setValue(2);

        System.out.println("{o.print2} += o.print2();");
        {o.print2} += o.print2();
        c.setValue(3);
    }
}
