package epam.Newyear;
import java.util.*;
public class Newyear {
	static Scanner sc = new Scanner(System.in);
	static Map<String, Integer> map = new HashMap<String, Integer>()
	{{
	                 put("Galaxy", 0); put("Milkybar", 0); put("Bournville", 0); put("CarrotHalwa", 0); put("MysorePak", 0); put("Rasgulla", 0);
	}};
	
	public static void main(String args[]) {
	
	sweet CarrotHalwa = new sweet();
	CarrotHalwa.setWeight(30);
	sweet MysorePak = new sweet();
	MysorePak.setWeight(45);
	sweet Rasgulla = new sweet();
	Rasgulla.setWeight(25);
	Galaxy dc = new Galaxy();
	Milkybar g = new Milkybar();
	Bournville c = new Bournville();
		char areMore = 'y';
	System.out.println("\n1. Galaxy\n2. Milkybar\n3. Bournville\n4. CarrotHalwa\n5. MysorePak\n6. Rasgulla");
	while (areMore == 'y') {
	System.out.println("Select what you want: ");
	       int n = sc.nextInt();
	       switch(n) {
	       case 1: map.put("Galaxy", map.get("Galaxy")+1); break;
	       case 2: map.put("Milkybar", map.get("Milkybar")+1); break;
	       case 3: map.put("Bournville", map.get("Bournville")+1); break;
	       case 4: map.put("CarrotHalwa", map.get("CarrotHalwa")+1); break;
	       case 5: map.put("MysorePak", map.get("MysorePak")+1); break;
	       case 6: map.put("Rasgulla", map.get("Rasgulla")+1); break;
	       }
	       System.out.println("Are there more sweets or chocolates? (y/n): ");
	       areMore = sc.next().charAt(0);
	}
	sc.close();
	
	double totalWt = dc.calcWeight(map.get("Galaxy")) + g.calcWeight(map.get("Milkybar")) + c.calcWeight(map.get("Bournville"));
	totalWt += Rasgulla.calcWeight(map.get("Rasgulla")) + MysorePak.calcWeight(map.get("MysorePak")) + CarrotHalwa.calcWeight(map.get("CarrotHalwa"));
	System.out.println("Total gift weight: " + totalWt);
	int quantity = 0;
	System.out.println("Number of individual candies: ");
	for (String candy : map.keySet()) {
	System.out.println(candy + " : " + map.get(candy));
	quantity += map.get(candy);
	}
	System.out.println("Total number of candies: " + quantity);
	}
	}
