package figury;

public class Cuboid extends Rectangle implements IFigury3D {
    private double height;
    public Cuboid(double sideA, double sideB, double h) {
        super("cuboid", sideA, sideB);
        this.height=h;
    }

    @Override
    public double getArea() {

        return super.getArea() * 2 + (sideA * height) * 2 + (sideB * height);
    }
    public double getVolume(){
        return super.getArea() * height;
    }

}
