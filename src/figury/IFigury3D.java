package figury;

public interface IFigury3D {
    double getVolume();
    public default void showVolume() {
        System.out.println("Volume( " + this.toString() + ")=" + this.getVolume());
    }
}
