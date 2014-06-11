package writebysub;

public class Sub extends Base {
    public void setX(int nx) {
        x = nx;
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
