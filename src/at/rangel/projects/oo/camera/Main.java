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

        Camera cam1 = new Camera(nikon, lens1, Camera.TYPE.LARGE, Color.GREEN, 0.75);
        Camera cam2 = new Camera(canon, lens2, Camera.TYPE.LARGE, Color.BLACK, 1.2);

        CameraGUI cameraGUI = new CameraGUI(cam1);
        cameraGUI.run();
    }
}
