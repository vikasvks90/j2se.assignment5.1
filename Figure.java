/**
* <h1>Figure</h1>
* This program implements an abstract class properties of which are 
* inherited by 3 classes: Circle,Rectangle,Triangle
* @author  Vikas
* @version 1.0
* @since   2017-05-05 
*/

package assignment5.session1;

public abstract class Figure {
	double dim1;
	abstract void findArea();
	abstract void findPerimeter();
}

//it will print the area and the perimeter of circle dim1 is the redius of circle
class Circle extends Figure{
    double dim1;
    //constructor to initialize the radius of circle
	public Circle(double dim1) {
		super();
		this.dim1 = dim1;
	}
	
	//to calculate area of circle
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		double area;
		area = Math.PI*Math.pow(dim1,2);
		System.out.println();
		System.out.println("Dimension of circle is: "+dim1);
		System.out.println("Area of circle is: "+area);
	}
	
	//to calculate perimeter of circle
	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter = 2*Math.PI*dim1;
		System.out.println();
		System.out.println("Dimension of circle is: "+dim1);
		System.out.println("Perimeter of circle is: "+perimeter);
	}
	
}

//it will print the area and the perimeter of rectangle dim1 is the side of rectangle
//it is assumed that rectangle has both sides equal i.e. (square)
class Rectangle extends Figure{
	double dim1;
	 //constructor to initialize the side of rectangle
	public Rectangle(double dim1) {
		super();
		this.dim1 = dim1;
	}
	
	//to calculate area of rectangle
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		double area;
		area = Math.pow(dim1,2);
		System.out.println();
		System.out.println("Dimension of Rectangle is: "+dim1);
		System.out.println("Area of Rectangle is: "+area);
	}
	
	//to calculate perimeter of rectangle
	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter = 4*dim1;
		System.out.println();
		System.out.println("Dimension of Rectangle is: "+dim1);
		System.out.println("Perimeter of Rectangle is: "+perimeter);
	}
	
}

//it will print the area and the perimeter of triangle dim1 is the side of triangle
//it is assumed that triangle has all sides equal i.e. (equilateral)
class Triangle extends Figure{
	double dim1;
	 //constructor to initialize the side of triangle
	public Triangle(double dim1) {
		super();
		this.dim1 = dim1;
	}
	
	//to calculate area of triangle
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		
		double area;
		area = (Math.sqrt(3)/4)*Math.pow(dim1,2);
		System.out.println();
		System.out.println("Dimension of triangle is: "+dim1);
		System.out.println("Area of triangle is: "+area);
	}

	//to calculate perimeter of triangle
	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter = 3*dim1;
		System.out.println();
		System.out.println("Dimension of triangle is: "+dim1);
		System.out.println("Perimeter of triangle is: "+perimeter);
	}
	
}