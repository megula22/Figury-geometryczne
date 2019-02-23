package figury;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Square sq1 = new Square(3.5);
        Cube cu1 = new Cube(3.5);
        sq1.showArea();
        cu1.showArea();
        Circle ci1 = new Circle(5.6);
        Cylinder cy1 = new Cylinder(6.7, 5.5);
        Rectangle re1 = new Rectangle(5.5,6.0);
        Cuboid cub1 = new Cuboid(5.0, 6.0, 7.0);
        Prism pr1 = new Prism(2, 2);
        Pyramid py1 = new Pyramid(2, 8);
        // deklarujemy zwykłą ArrayListę (bez typowania)
        ArrayList<Shape>  figury = new ArrayList<Shape>();
        figury.add(sq1);
        figury.add(cu1);
        figury.add(ci1);
        figury.add(cy1);
        figury.add(re1);
        figury.add(cub1);
        figury.add(pr1);
        figury.add(py1);
        for(Shape figura : figury)
            figura.showArea();
        Square sześcian1 = new Cube(3.6);
        ArrayList lista = new ArrayList();
        lista.add(sq1);
        lista.add(cu1);
        lista.add(ci1);
        lista.add(cy1);
        lista.add(7.6);
        lista.add(LocalDate.of(2019, 1, 27));
        lista.add("Ala ma kota");
        lista.add(sześcian1);
        lista.add(re1);
        lista.add(cub1);
        lista.add(pr1);
        lista.add(py1);
        System.out.println("==== wyświetlenie toString() dla elementów ArrayList ===");
        for(Object ob : lista) {
            System.out.println(ob.toString());
        }
        System.out.println("==== wywołanie metody showArea() dla obiektów należących do Shape ===");
        for(Object ob : lista) {
            if (ob instanceof IFigury3D) {
                IFigury3D sh = (IFigury3D) ob;
                sh.showVolume();
            }
        }
        // należy dopisać klasy: Rectangle (prostokąt) i Cuboid (prostopadłościan)
    }
}
