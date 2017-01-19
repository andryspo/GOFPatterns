package Adapter;

public class Main {

    public static void main(String[] args) {
        VectorGraphicsInterface raster = new VectorAdapterFromRaster();
        raster.drawLine();
        raster.drawSquare();
    }
}
