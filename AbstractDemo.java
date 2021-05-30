package Assignment1;

abstract class Shape{
	abstract double calculateArea();
	void setColor(String color) {
		System.out.println("Color is "+color);
	}
}

class Circle extends Shape{
	double calculateArea() {
		return 5.0*5.0*3.14;
	}
}

class Square extends Shape{
	double calculateArea() {
		return 5.0*5.0;
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println(c.calculateArea());
		c.setColor("Black");
		Square s=new Square();
		System.out.println(s.calculateArea());
		s.setColor("Blue");
	}

}
