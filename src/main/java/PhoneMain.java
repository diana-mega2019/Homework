public class PhoneMain {
    public static void main(String[] args) {
        Phone phone = new SamsungGalaxyS6(24);
        ((SamsungGalaxyS6) phone).setColor("white");
        ((SamsungGalaxyS6) phone).setMaterial("ceramic");
        System.out.println(((SamsungGalaxyS6) phone).getImei());
        System.out.println(phone);


        phone.createNewContact(1, "0756563321", "Michael", "Austin");
        phone.createNewContact(2, "0721664209", "Christina", "Raw" );

        ((SamsungGalaxyS6) phone).listContacts();

        phone.sendATextMessage("0756563321", "");
        phone.sendATextMessage("0756563321", "Hello! How are you?");


        phone.seeAllMessagesForASpecificContact("0756563321");

        ((SamsungGalaxyS6) phone).makeACall("0721664209");

        ((SamsungGalaxyS6) phone).seeAllCallHistory();









    }
}
