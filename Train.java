package Assignment1;

interface IVehicle{
	void drive();
	void turnLeft();
	void brake();
}
interface IPublicTransport{
	void getNumberOfPeople();
}
class MotorisedVehicle{
	void checkMotor() {
		System.out.println("The motor of the vehicle is in good condition");
	}
}
class Car extends MotorisedVehicle implements IVehicle{
	public void drive() {
		System.out.println("The owner of the car is driving he car");
	}
	public void turnLeft() {
		System.out.println("Car is turning ledt");
	}
	public void brake() {
		System.out.println("The car's brake is working");
	}
}
public class Train implements IVehicle,IPublicTransport{
	public void drive() {
		System.out.println("The owner of the car is driving the Train");
	}
	public void turnLeft() {
		System.out.println("Train is turning left");
	}
	public void brake() {
		System.out.println("The train's brake is working");
	}
	public void getNumberOfPeople() {
		System.out.println("Total number of people in train is 500");
	}
	public static void main(String[] args) {
		IVehicle v=new Car();
		v.drive();
		v.brake();
		v.turnLeft();
		MotorisedVehicle c=new Car();
		c.checkMotor();
		IVehicle i=new Train();
		i.brake();
		i.drive();
		i.turnLeft();
		IPublicTransport ip=new Train();
		ip.getNumberOfPeople();		
	}
}







