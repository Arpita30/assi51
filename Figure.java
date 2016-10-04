//abstract class figure with some properties and abstract methods and 3 overloaded constructor
 abstract class Figure {
	 
	double dim1,dim2,dim3;
	
	abstract void findArea();
	
	abstract void findPerimeter();
	
	Figure(double r){
		dim1=r;
	}
	Figure(double r, double s){
		dim1=r;
		dim2=s;
	}
	Figure(double r,double s, double t){
		dim1=r;
		dim2=s;
		dim3=t;
	}
	
}
