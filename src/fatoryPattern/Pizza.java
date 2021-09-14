package fatoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings = new ArrayList<String>();
	
	void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Putting on sauce...");
		System.out.println("Putting on cheese");
		System.out.println("Adding toppings");
		for (String string : toppings) {
			System.out.println(string + " ");
		}
		
	}
	
	void bake() {
		System.out.println("Baking for 20 minutes");
	}
	
	void cut() {
		System.out.println("Cutting diagonal pieces");
	}
	
	void box() {
		System.out.println("putting in box");
	}
	
	public String getName() {
		return name;
	}
	
}
