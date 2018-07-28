class ThrA extends Thread {
    ThrA(String s) {
        super(s);
        System.out.println(this.getName() + " started!");
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " at count : " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.print("Exception -> ");
                e.printStackTrace();
            }
        }
    }
}

public class Thr {
    public static void main(String nvn[]) {
        new ThrA("Thread A").start();
        new ThrA("Thread B").start();
        new ThrA("Thread C").start();
    }
}
