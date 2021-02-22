package Dita.toStr;

public class Vehicle {
	
	//static fields or class variables
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	//non static fields or instance variables
	private String chassisNo;
	private String model;
	
	Vehicle (String model){
		Vehicle.numVehicles++;						//static. must be declared their place first
		chassisNo = "ch" + Vehicle.numVehicles;
		this.model = model;							//non static. must be declared this or super
		System.out.println("\nVehicle manufactured");
	}
	
	private static final String make = "Predicter";
	private static final int capacity = 1600;

	public void setChassisNo() {}
	public String getChassisNo() {return chassisNo;}
	public void setModel() {}
	public String getModel() {return model;}
	
	public void setMAKE(String m) {MAKE = m;}
	public String getMAKE() {return MAKE;}
	
	public void setMake() {}
	public String getMake() {return make;}
	public void setCapacity() {}
	public int getCapacity() {return capacity;}
	
	
	public String toString () {
		String ds;
		ds = "The vehicle is manufactured by : " + getMAKE() 
			+"\nThe model type is " + getModel()
			+"\nThe chassis number is " + getChassisNo()
			+"\nThe engine make is " + getMake()
			+"\nThe engine capacity is " + getCapacity();
		return ds;
	}

	public static class Engine extends Vehicle {

		Engine(String model) {
			super(model);
			// TODO Auto-generated constructor stub
		}
		
		//if not exist, driver will invoke toString from container class
		public String toString () {
			String ds;
			ds = "Vehicle number " + getChassisNo()
				+" is a " + getModel()
				+" and has an engine capacity of " + getCapacity() + "cc";
			return ds;
		}
		
	}
	
	
}
