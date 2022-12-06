package at.rangel.projects.oo.phone;

import java.util.Scanner;

public class PhoneGUI {
    private Phone phone;

    public PhoneGUI(Phone phone) {
        this.phone = phone;
    }

    public void run() {
        System.out.println("Welcome to the SmartPhone 1.0");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1 - call\n2 - picture\n3 - storage\n4 - get files\n");
            int selection = scan.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Please write down the phone number you would like to call.");
                    String phoneNumber = scan.next();
                    this.phone.makeCall(phoneNumber);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Please choose the resolution of your picture.");
                    int resolution = scan.nextInt();
                    this.phone.takePicture(resolution);
                    break;
                case 3:
                    System.out.println("Free space: " + this.phone.getFreeSpace() + "MB of " + this.phone.getSdCard().getCapacity() + "MB");
                    break;
                case 4:
                    System.out.println("\nFiles of the phone: ");
                    this.phone.printAllFiles();
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Please choose a valid task number!");
                    break;
            }
        }
    }
}
