package entities;

import ij.IJ;
import ij.ImagePlus;

public class DisplayImage {
    private ImagePlus imagePlus;

    public DisplayImage(String path) {
        imagePlus = IJ.openImage(path);
    }

    public void show() {
        imagePlus.show();
    }
}