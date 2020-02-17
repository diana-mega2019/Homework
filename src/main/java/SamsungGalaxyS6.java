import java.lang.reflect.Array;
import java.util.*;

public class SamsungGalaxyS6 extends Samsung implements Phone {
    public static final long imei = 65789998;
    private int actualBaterryLife;

    protected SamsungGalaxyS6(int batteryLife) {
        super(batteryLife);
    }

    private String color;
    private String material;


    public void makeACall() {

    }

    public void seeAllCallsHistory() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public static long getImei() {
        return imei;
    }

    @Override
    public String toString() {
        return "SamsungGalaxyS6{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }

    private Map<String, List<String>> phoneNumbersToContacts = new LinkedHashMap<>();

    public void createNewContact(int index, String phoneNumber, String firstName, String lastName) {
        String contact = firstName.toString() + lastName.toString();
        List<String> phoneNumbers = new LinkedList<>();
        phoneNumbers.add((String) phoneNumber);
        phoneNumbersToContacts.put(contact, phoneNumbers);
    }

    public void listContacts() {

        for (String key : phoneNumbersToContacts.keySet()) {
            List<String> phoneNumbers = phoneNumbersToContacts.get(key);
            System.out.println(key + ": " + phoneNumbers);
        }
    }
    String[] smsHistory = new String[500];

    @Override
    public void sendATextMessage(String phoneNumber, String messageContent) {
        int actualBatteryLife = batteryLife;
        if (messageContent.isEmpty() || messageContent.length() > 100) {
            System.out.println("Error: Your SMS is empty or its size exceeds the accepted number of character");
        } else {
            System.out.println("Your text message" + " " + messageContent + " " + "is sending to" + " " + phoneNumber);
            if (actualBatteryLife > 1) {
                actualBatteryLife = actualBatteryLife - 1;
                System.out.println("Current battery life is:" + " " + actualBatteryLife + " " + "h");
                smsHistory[0] = messageContent;
            } else {
                System.out.println("Low battery. The phone will turn off in a few minutes");
            }
        }
    }

    public void seeAllMessagesForASpecificContact(String phoneNumber){
        for (String strTemp : smsHistory) {
            if (strTemp != null) {
                System.out.println(strTemp);
            }
        }

    }

    String[] callHistory = new String[50];
    public void makeACall(String phoneNumber){
        int actualBatteryLife = batteryLife;
        if (actualBatteryLife > 2) {
            System.out.println(phoneNumber + " " + "call in progress..");
            actualBatteryLife = actualBatteryLife - 2;
            System.out.println("Current battery life is:" + " " + actualBatteryLife + " " + "h");
            callHistory[0] = phoneNumber;
        } else {
            System.out.println("Low Battery!");
        }
    }

    public void seeAllCallHistory(){
        for (String strTemp : callHistory) {
            if (strTemp != null) {
                System.out.println(strTemp);
            }
        }
    }

}

