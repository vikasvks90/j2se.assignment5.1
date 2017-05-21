/**
* <h1>FigureDemo</h1>
* This program implements an class to call the methods of
* 3 classes: Circle,Rectangle,Triangle
* @author  Vikas
* @version 1.0
* @since   2017-05-05 
*/

package assignment5.session1;

public class FigureDemo {

	public static void main (String[] args){
		Circle circle = new Circle(10);
		Rectangle rectangle = new Rectangle(10);
		Triangle triangle = new Triangle(10);
		circle.findArea();
		circle.findPerimeter();
		rectangle.findArea();
		rectangle.findPerimeter();
		triangle.findArea();
		triangle.findPerimeter();
	}

}
