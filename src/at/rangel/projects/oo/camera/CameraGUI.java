package at.rangel.projects.oo.camera;

import java.util.Scanner;

public class CameraGUI {
    private Camera camera;

    public CameraGUI(Camera camera) {
        this.camera = camera;
    }

    public void run() {
        System.out.println("Welcome to the SmartPhone 1.0");
        Scanner scan = new Scanner(System.in);
        System.out.println("1 - Take a picture\n2 - Change resolution\n3 - Get all photos\n4 - Get current free storage\n5 - Add new SDCard\n6 - Switch SDcard");
        int selection = scan.nextInt();
        while (true) {
            switch (selection) {

            }
        }
    }
}
