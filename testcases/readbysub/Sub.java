package readbysub;

public class Sub extends Base {
    public int getX() {
        return x;
    }
    public void print() {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Sub s = new Sub();
        {s.getX} += s.print();
        s.setX(1);
    }
}
