//class Rectangle extending figure and implementing method to find area and perimeter of rectangle
public class Rectangle extends Figure {

	Rectangle(double r, double s) {
		super(r, s);
		// using Figure class's constructor for initialization
	}

	void findArea() {
		double area=dim1*dim2;
		System.out.println("Area of the rectangle is: "+area+"square cm");
		
	}

	void findPerimeter() {
		double peri=dim1+dim2;
		System.out.println("Perimeter of the rectangle is: "+peri+"cm");
	}
}
