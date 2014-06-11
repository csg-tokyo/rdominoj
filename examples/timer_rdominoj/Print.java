package timer_rdominoj;

import java.util.*;

public class Print {
    public static void printCurrentTime(long time) {
        System.out.println(System.currentTimeMillis());
    }
    public static void main(String[] args) {
        TimerTask task = new TimerTask() {
            public void run() {
                printCurrentTime(System.currentTimeMillis());
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 0, 100);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("");
            System.exit(1);
        }
        timer.cancel();
    }
}
