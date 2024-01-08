package oopsconcepts2024.allclassAndObject.pillers;

public class Car {

		int noOfWheels;
		String color;
		float maxSpeed;
		float currentFuleInLiters;
		int noOfSheats;
		// all instance method
	
		public void drive(){
			if(currentFuleInLiters==0) {
				System.out.println("Car is  out if fuel");
			}
			else if (currentFuleInLiters<5){
				System.out.println(" Car is in reseraved mode please refule");
			}
			else {
				System.out.println("Car is Driving");
				currentFuleInLiters--;
			}
			
		}
		public void addFuele( float fuel) {
			currentFuleInLiters = currentFuleInLiters + fuel;
		}
			
		public  float getCurrentFuelLevel() {
			return currentFuleInLiters;
		}
		
	}


