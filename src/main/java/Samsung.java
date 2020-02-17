public abstract class Samsung {
    protected int batteryLife;
    protected Samsung(int batteryLife){
        this.batteryLife = 30;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public abstract void createNewContact(int index, String phoneNumber, String firstName, String lastName);
}
