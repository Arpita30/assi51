//class circle extending figure and implementing method to find area and perimeter of circle
public class Circle extends Figure {

	Circle(double r) {
		super(r);
		// using Figure class's constructor for initialization
	}

	void findArea() {
		double area=Math.PI*(Math.pow(dim1, 2));
		System.out.println("Area of the circle is: "+area+"square cm");
		
	}

	void findPerimeter() {
		double peri=2*Math.PI*dim1;
		System.out.println("Perimeter of the circle is: "+peri+"cm");
	}

}
