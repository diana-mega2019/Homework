package Concurrency;
import java.util.Collections;
import java.util.LinkedList;
public class FestivalStatisticsThread implements Runnable {
    String threadName;
    static FestivalGate gate = new FestivalGate();
    LinkedList list;
    int fullTickets = 0;
    int freePass = 0;
    int vipPass = 0;
    int oneDayPass = 0;
    int oneDayVIP = 0;
    public FestivalStatisticsThread(String name) {
        threadName = name;
        list = gate.generateAttendeeThread();
    }
    public void run(){
        try {
            System.out.println(threadName + " read statistics...");
            Thread.sleep(5000);
            for(int i = 0 ; i < list.size(); i++) {
               freePass = Collections.frequency(list, "FREE_PASS");
               fullTickets = Collections.frequency(list, "FULL");
               vipPass = Collections.frequency(list, "FULL_VIP");
               oneDayPass = Collections.frequency(list, "ONE_DAY_PASS");
               oneDayVIP = Collections.frequency(list, "ONE_DAY_VIP");
            }
            System.out.println(list.size() + " -people entered; " +
                    freePass + " -free passes; " + fullTickets + " -full tickets; " +
                    vipPass + " -VIP passes; " + oneDayVIP + " -one day VIP; " +
                    oneDayPass + " -one day passes; ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
