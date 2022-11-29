package at.rangel.projects.oo.phone;

public class Main {
    public static void main(String[] args) {
        //sizes of files are in megabytes
        SimCard simCard1 = new SimCard(1, "06601253");
        //SimCard simCard2 = new SimCard(2, "06609281");
        SDCard sdCard1 = new SDCard(16000);
        Camera camera1 = new Camera(1080);

        Phone phone1 = new Phone(simCard1, sdCard1, camera1);
        phone1.setColor("green");
        System.out.println("Color of phone: " + phone1.getColor());
        phone1.makeCall("06601438");
        System.out.println("Free available space: " + phone1.getFreeSpace());
        PhoneFile f1 = new PhoneFile("jpg", 1.5, "pic1");
        PhoneFile f2 = new PhoneFile("jpg", 2.1, "pic1");
        PhoneFile f3 = new PhoneFile("jpg", 3, "pic1");

        phone1.takePicture(1080);
        System.out.println("Free available space: " + phone1.getFreeSpace());
    }
}
