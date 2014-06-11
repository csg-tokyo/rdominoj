package sheet_rdominoj;
import sheet_wrapper.*;

public class PlusSheet extends Sheet {
    private IntCell a=null, b=null, c=null;
    public PlusSheet() {
        super("PlusSheet", 2, 3);
        setHeaders("A1", "B1", "C1");
        a = new IntCell(0);
        b = new IntCell(0);
        c = new IntCell(0);
        add(a);
        add(b);
        add(c);
        pack();
        {_} += this.updateA();
    }
    public void updateA() {
        a.setValue(b.getValue() + c.getValue());
    }
    public static void main(String[] args) {
        PlusSheet p = new PlusSheet();
        p.show();
    }
}
