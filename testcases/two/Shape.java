package two;

public class Shape {
    private int x = 0;
    public void setX(int nx) { x = nx; }
    public void moveX(int dx) { x = x + dx; }
    public int getX() {
        return x;
    }
    public void print() {
        System.out.println("print " + getX());
    }
    public Shape() {
        {this.getX} += this.print();
    }
    public static void main(String[] args) {
        Shape s = new Shape();
        s.setX(1);
        s.moveX(2);
    }
} 
