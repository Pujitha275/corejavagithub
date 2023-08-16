package oops;
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
           dim1 = a;
            dim2 = b;
    }
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
            super(a, b);
    }
    double area() {
            System.out.println("Inside Area for Rectangle.");
            return dim1 * dim2;
    }
}
class Triangle extends Figure {
    Triangle(double a, double b) {
            super(a, b);
    }
    double area() {
            System.out.println("Inside Area for Triangle.");
            return dim1 * dim2 / 2;
    }
}

public class AbstractEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Figure f = new Figure(10, 10); // illegal now
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; 
        figref = r;
        System.out.println("Area is " + figref.area());
        System.out.println("Area using retangle object " + r.area());
        figref = t;
        System.out.println("Area is " + figref.area());

	}

}
