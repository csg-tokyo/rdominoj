package meter_rdominoj;

import java.util.*;

public class Meter {
    private Shape from;
    private Shape to;
    public double distance() {
        double x2 = Math.pow(to.getX()-from.getX(), 2);
        double y2 = Math.pow(to.getY()-from.getY(), 2);
        return Math.sqrt(x2 + y2);
    }

    public void print() {
        System.out.println("the distance between " + from.getName() + " and " + to.getName() + " is " + distance() + ".");
    }
    public Meter(Shape a, Shape b) {
        from = a;
        to = b;


        {this.print} += this.print();
    }
    public static void main(String[] args) {
        final Shape s1 = new Shape("s1", null);
        final Shape s2 = new Shape("s2", null);
        final Shape s3 = new Shape("s3", s2);
        Meter m = new Meter(s1, s3);

        s1.setX(3);   s1.setY(4);
        s1.setName("x1");
        s2.setX(8);   s2.setY(16);
        s1.moveX(13); s1.moveY(27);
        s3.setName("x3");
        s2.moveX(1);  s2.moveY(-9);
        s2.setName("x2");
        s3.moveX(16); s3.moveY(64);

        /*
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            long time = System.currentTimeMillis();
            double v = 0.001;
            public void run() {
                int dx = (int) ((System.currentTimeMillis()-time) * v);
                s2.setX(dx);
            }
        };
        timer.scheduleAtFixedRate(task, 0, 100);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("");
            System.exit(1);
        }
        timer.cancel();
        */
    }
}
