
class Line {
    public synchronized void getLine() {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("err");
            }
        }
    }
}

class MyThread extends Thread {

    Line line;

    MyThread(Line line) {
        this.line = line;
    }

    public void run() {
        line.getLine();
    }

}

public class syncThreads {
    public static void main(String s[]) {
        Line l = new Line();

        MyThread a = new MyThread(l);
        MyThread b = new MyThread(l);

        a.start();
        b.start();
    }
}