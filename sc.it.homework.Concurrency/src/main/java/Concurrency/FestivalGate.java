package Concurrency;
import java.util.LinkedList;
public class FestivalGate {
    public static void main(String[] args) {
        generateStatistics();
    }
    private static void generateStatistics() {
        FestivalStatisticsThread fst = new FestivalStatisticsThread("Statistics");
        Thread newTrd = new Thread(fst);
        newTrd.start();
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static synchronized  LinkedList<String> generateAttendeeThread() {
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            FestivalAttendeeThread fat = new FestivalAttendeeThread(TicketType.generateRandomTicket().toString());
            list.add(fat.thread.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}


