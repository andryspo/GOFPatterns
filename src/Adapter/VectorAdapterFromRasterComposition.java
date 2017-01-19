package Adapter;

public class VectorAdapterFromRasterComposition implements VectorGraphicsInterface {

    private RasterGraphics graphics;

    @Override
    public void drawLine() {
        graphics.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        graphics.drawRasterSquare();
    }
}
