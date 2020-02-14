public interface Phone {
    void createNewContact(int index, String phoneNumber, String firstName, String lastName);
    void listContacts();
    void sendATextMessage(String phoneNumber, String messageContent);
    void seeAllMessagesForASpecificContact(String phoneNumber);
    void makeACall();

    void seeAllCallsHistory();

}
