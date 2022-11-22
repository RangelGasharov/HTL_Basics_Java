package at.rangel.projects.oo.phone;

public class Main {
    public static void main(String[] args) {
        SimCard simCard1 = new SimCard(1, "06601253");
        SDCard sdCard1 = new SDCard(5000);
        Camera camera1 = new Camera(1080);

        Phone phone1 = new Phone(simCard1, sdCard1, camera1);
    }
}
