package outer;

public class IntCell {
    private String name = "";
    public int value = 0;
    public IntCell(String n) {
        name = n;
    }
    public void setValue(int v) {
        value = v;
    }
    public int getValue() {
        return value;
    }
    public void print() {
        System.out.println(name + ": print " + getValue());
    }
}
