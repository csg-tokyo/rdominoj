package redundant_dominoj;

public class Shape {
    private Shape parent;

    private String name;
    public String getName() {
        if(parent == null)    return name;
        return parent.getName() + ":" + name;
    }
    public void setName(String n) { name = n; }

    public void renamed(String s);

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

    public void moved(int v);

    public void dirty(Object[] args);
    public void refresh(Object[] args) {
        System.out.println(getName() + ": " + getX() + ", " + getY());
    }

    public Shape(String n, Shape p) {
        parent = p;

        name = n;
        setName += renamed;

        setX += moved; moveX += moved;
        setY += moved; moveY += moved;

        renamed += dirty; moved += dirty;
        dirty += refresh;

        if(parent != null) {
            parent.moved += moved;
            parent.renamed += renamed;
            parent.dirty += dirty;
        }
    }
    public static void main(String[] args) {
        Shape p = new Shape("parent", null);
        Shape c = new Shape("child", p);
        p.setX(1);
    }
} 
