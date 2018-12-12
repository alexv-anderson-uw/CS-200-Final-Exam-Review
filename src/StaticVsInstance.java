/**
 * Demonstrates the differences between static and instance data/methods in a class
 * 
 * @author Sandhya
 */
class Car{
	private static int CAR_COUNT=0;
	private String model;
	private String carNumber;
	
	Car(){
		updateCarCount();
	}
	
	Car(String model, String number){
		this.model = model;
		carNumber = number;
		updateCarCount();
	}
	
	public static int getCarCount() {
		return CAR_COUNT;
	}
	
	private static void updateCarCount() {
		CAR_COUNT++;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setCarNumber(String number) {
		carNumber = number;
	}
	
	public String getCarNumber() {
		return this.carNumber;
	}
	
}
public class StaticVsInstance {

	/**
	 * Entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.setModel("Chrysler");
		car1.setCarNumber("WI-1053 A");
		System.out.println("Car 1 - number : " + car1.getCarNumber());
		
		Car car2 = new Car("Subaru", "MN-4453 B");
		System.out.println("Car 2 - model : " + car2.getModel());
		
		System.out.println("Number of cars : " + Car.getCarCount());
		
	}
}
