package Dita.Logic;
/*
 * Determine quality of fish
 */
public class Fish {

	String typeOfFish;
	int friendlines;
	String level;
	
	public Fish () {
		typeOfFish = "Unknown";
		friendlines = 3;
		level = getLevel(friendlines);
	}
	
	public Fish (String t, int f) {
		typeOfFish = t;
		friendlines = f;
		level = getLevel(friendlines);
	}
	
	public String getTypeOfFish() {
		return typeOfFish;
	}

	public int getFriendlines() {
		return friendlines;
	}
	
	public String getLevel (int i) {		//coba ganti return dgn print
		if (i == 1) return "mean";
		if (i == 2) return "not friendly";
		if (i == 3) return "neutral";
		if (i == 4) return "friendly";
		if (i == 5) return "very friendly";
		return "error";
		
	}
	
	public static void nicestFish(Fish ... fishs ) {
		Fish temp = fishs[0];
		
		for(int i=1; i<fishs.length; i++) {
			if (fishs[i].friendlines > temp.friendlines){
				temp = fishs[i];
				}
			}
		System.out.println("The Nicest Fish is "+ temp.typeOfFish + 
							" type with " + temp.friendlines + 
							" friendlines with " + temp.level + " level.");
		
	}
	
	public static void main (String [] args) {
		Fish Amber = new Fish ("AngelFish", 5);
		Fish James = new Fish ("Guppy", 3);
		Fish Dodi = new Fish ();
		nicestFish(Amber, James, Dodi);
	}
	

	

	
	
	
}
