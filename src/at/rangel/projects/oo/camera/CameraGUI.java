package at.rangel.projects.oo.camera;

import java.util.Scanner;

public class CameraGUI {
    private Camera camera;

    public CameraGUI(Camera camera) {
        this.camera = camera;
    }

    public void run() {
        System.out.println("Welcome to your " + this.camera.getManufacturer().getNameOfManufacturer() + " camera!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1 - Take a picture; 2 - Change resolution; 3 - Get all photos; 4 - Get current free storage;\n5 - Add new SDCard; 6 - All available SDCards; 7 - Switch SDCard\n");
            int selection = scanner.nextInt();
            switch (selection) {
                case 1:
                    this.camera.takePicture();
                    break;
                case 2:
                    System.out.println("Possible resolutions: 1 - SMALL, 2 - MEDIUM, 3 - LARGE");
                    int resolutionChoice = scanner.nextInt();
                    this.camera.changeResolution(resolutionChoice);
                    break;
                case 3:
                    this.camera.getSdCard().getAllPhotos();
                    break;
                case 4:
                    double freeSpace = this.camera.getSdCard().checkFreeSpace();
                    System.out.println("Current free space: " + freeSpace + " GB");
                    break;
                case 5:
                    System.out.println("Please write down the capacity of the new SDCard (in GB)!");
                    double capacity = scanner.nextDouble();
                    if (capacity <= 0) {
                        System.out.println("Please choose a meaningful amount of capacity!");
                        break;
                    }
                    SDCard sdCard = new SDCard(capacity);
                    this.camera.getSdCardList().add(sdCard);
                    System.out.println("SDCard has been added!");
                    break;
                case 6:
                    for (int i = 0; i <= this.camera.getSdCardList().size() - 1; i++) {
                        System.out.println(i + 1 + ". SD Card, Capacity: " + this.camera.getSdCardList().get(i).getCapacity() + ", Free space: " + this.camera.getSdCardList().get(i).checkFreeSpace());
                    }
                    break;
                case 7:
                    System.out.println("Write down the place of the SD Card!");
                    int numberOfSDCard = scanner.nextInt() - 1;
                    if (numberOfSDCard < 0 || numberOfSDCard > this.camera.getSdCardList().size() - 1) {
                        System.out.println("There is no SDCard on the given place!");
                        break;
                    }
                    this.camera.setSdCard(this.camera.getSdCardList().get(numberOfSDCard));
                    break;
                default:
                    System.out.println("Please choose a valid number to execute a task!");
                    break;
            }
        }
    }
}
