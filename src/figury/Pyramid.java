package figury;

import jdk.nashorn.internal.ir.IfNode;

public class Pyramid extends Triangle implements IFigury3D {
    public double height;

    public Pyramid() {
        super("pyramid");
        height = 0;
    }
    public Pyramid(double side, double height) {
        super("pyramid", side);
        this.height = height;
    }
    public double getArea() {
        double pole =  ((getSide()*getSide())*Math.sqrt(3))/4.0 + 3.0 * height * getSide() / 2.0;
        return pole;
    }
    public double getVolume() {
        return super.getArea() * height/3;
    }

//    {
//        double vol = this.getArea() * 1.0 /3.0 * height;
//        return vol;
//    }
//    public void showVolume() {
//        System.out.println("Pyramid volume = " + String.format("%.3f", this.getVolume()));
//    }
}
