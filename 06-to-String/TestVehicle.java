package Dita.toStr;

public class TestVehicle {

	public static void main (String [] args) {
		System.out.println("Manufacturer: " + Vehicle.MAKE);
		System.out.println("Number of vehicle manufactured: " + Vehicle.numVehicles);
		
		//System.out.println("The chassis number is " + Vehicle.getChassisNo());
		//CAN'T BECAUSE NO INSTANCE INSTANCIATED
		
		Vehicle vehicle1 = new Vehicle("Vsion");
		System.out.println(vehicle1.toString());
		
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println(vehicle2.toString());
		
		vehicle1.setMAKE("Seer");
		vehicle2.setMAKE("Seer");
		System.out.println("\n" + vehicle1.toString());
		System.out.println("\n" + vehicle2.toString());
		
		System.out.println("\nNumber of vehicle manufactured: " + Vehicle.numVehicles);
		
		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		System.out.println(vehicle3.toString());	//toString from inner
		
		System.out.println("\nNumber of vehicle manufactured: " + Vehicle.numVehicles);
		
	}
	
}
