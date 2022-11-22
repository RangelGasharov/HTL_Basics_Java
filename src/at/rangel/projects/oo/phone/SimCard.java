package at.rangel.projects.oo.phone;

public class SimCard {
    private int id;
    private String phoneNumber;

    public SimCard(int id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public void doCall(String phoneNumber) {

    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
