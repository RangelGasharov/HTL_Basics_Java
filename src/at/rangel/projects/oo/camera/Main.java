package at.rangel.projects.oo.camera;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Manufacturer nikon = new Manufacturer("Nikon", "Japan");
        Manufacturer sony = new Manufacturer("Sony", "Japan");
        Manufacturer olympus = new Manufacturer("Olympus", "Japan");

        CameraLens lens1 = new CameraLens(55, sony);
        CameraLens lens2 = new CameraLens(60, canon);

        SDCard sdCard1 = new SDCard(16);
        SDCard sdCard2 = new SDCard(32);

        Camera cam1 = new Camera(nikon, lens1, Color.GREEN, 0.75, sdCard1);
        Camera cam2 = new Camera(canon, lens2, Color.BLACK, 1.2, sdCard2);

        cam1.addSDCard(sdCard1);

        CameraGUI cameraGUI = new CameraGUI(cam1);
        cameraGUI.run();
    }
}
