
public class Animal {

	String name;
	int legs;
	
	public Animal(String n, int l) {
		name = n;
		legs = l;
	}
	
	public String toString() {
		return name + " (" + legs + ")";
	}
	
	public int getLegs() {
		return legs;
	}
	
}
