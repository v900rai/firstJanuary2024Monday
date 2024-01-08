package oopsconcepts2024.allclassAndObject.pillers;

public class DriverCar {
	public static void main(String [] args) {
		Car myCar=new Car();
		myCar.addFuele(6);
		myCar.drive();
		myCar.drive();
		myCar.drive();
		myCar.drive();
		System.out.println(myCar.getCurrentFuelLevel());
		
	}
	

}
