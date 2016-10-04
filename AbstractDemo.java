
public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle c=new Circle(5.5);
		c.findArea();
		c.findPerimeter();
		Triangle t=new Triangle(10, 20.7,5);
		t.findArea();
		t.findPerimeter();
		Rectangle r=new Rectangle(20,30);
		r.findArea();
		r.findPerimeter();

	}

}
