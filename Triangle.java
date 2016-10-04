//class triangle extending figure and implementing method to find area and perimeter of triangle
public class Triangle extends Figure{

	Triangle(double r, double s, double t) {
		super(r, s, t);
		// using Figure class's constructor for initialization
	}

	void findArea() {
		double area=(dim1*dim2)/2;
		System.out.println("Area of the triangle is: "+area+"square cm");
		
	}

	void findPerimeter() {
		double peri=dim1+dim2+dim3;
		System.out.println("Perimeter of the triangle is: "+peri+" cm");
	}
	

}
