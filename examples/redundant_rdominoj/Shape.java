package redundant_rdominoj;

public class Shape {
    private Shape parent;

    private String name;
    public String getName() {
        if(parent == null)    return name;
        return parent.getName() + ":" + name;
    }
    public void setName(String n) { name = n; }



    private int x = 0;
    public void setX(int nx) { x = nx; }
    public void moveX(int dx) { x = x + dx; }
    public int getX() {
        if(parent == null)    return x;
        return parent.getX() + x;
    }

    private int y=0;
    public void setY(int ny) { y = ny; }
    public void moveY(int dy) { y = y + dy; }
    public int getY() {
        if(parent == null)    return y;
        return parent.getY() + y;
    }




    public void refresh() {
        System.out.println(getName() + ": " + getX() + ", " + getY());
    }

    public Shape(String n, Shape p) {
        parent = p;

        name = n;












        {this.refresh} += this.refresh();
    }
    public static void main(String[] args) {
        Shape p = new Shape("parent", null);
        Shape c = new Shape("child", p);
        p.setX(1);
    }
} 
