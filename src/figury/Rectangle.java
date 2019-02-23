package figury;

public class Rectangle extends Shape{
    protected double sideA;
    protected double sideB;
    public Rectangle (){}
        public Rectangle(double sideA, double sideB){
            super ("rectangle");
            this.sideA = sideA;
            this.sideB = sideB;
        }
            public Rectangle(String name, double sideA, double sideB) {
            super(name);
            this.sideA = sideA;
            this.sideB = sideB;

    }

        public double getArea() {
            return sideA*sideB;
        }


}
