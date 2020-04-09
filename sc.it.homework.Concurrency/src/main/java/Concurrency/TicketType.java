package Concurrency;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public enum TicketType {
    FULL, FULL_VIP, FREE_PASS, ONE_DAY_PASS, ONE_DAY_VIP;
    private static final List<TicketType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    public static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();
    public static TicketType generateRandomTicket(){
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
