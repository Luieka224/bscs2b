class App {
    public static void main(String[] args) {
        Circle circ = new Circle(2);
        Square sqr = new Square(5);

        System.out.println("The area for "+ circ.getShapeName() +" is "+circ.getArea());
        System.out.println("The area for "+ sqr.getShapeName() +" is "+sqr.getArea());
    }
}

abstract class Shape {
    public abstract double getArea(double radius);
    public abstract String getShapeName();
}

class Circle extends Shape {
    double radius;
    String shapeName = "Circle";

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area, radius = this.radius;

        area = Math.PI*(radius*radius);

        return area;
    }

    public String getShapeName() {
        return this.shapeName;
    }
}

class Square extends Shape {
    double side;
    String shapeName = "Square";

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        double area;
        double side = this.side;

        area = side*side;

        return area;
    }

    public String getShapeName() {
        return this.shapeName;
    }
}