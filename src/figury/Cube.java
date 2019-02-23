package figury;

public class Cube extends Square implements IFigury3D {
    public Cube(double side) {
        super("cube", side);
    }
    @Override
    public double getArea() {
        return super.getArea()*6;
    }
    public double getVolume(){
        return super.getArea() * getSide();
    }

}
