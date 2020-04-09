package Concurrency;
public class FestivalAttendeeThread implements Runnable {
    Thread thread;
    public FestivalAttendeeThread(String name) {
        thread = new Thread(this, name);
        thread.start();
    }
    public void run() {
        System.out.println(thread.getName() + " entered at the festival");
        try {
                Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}





