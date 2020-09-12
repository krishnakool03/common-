package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lnmap {
	public static void main(String[] args) {
		Map <Integer,Float> r5 = new LinkedHashMap<Integer,Float>();
		r5.put(47, (float) 96.6);
		r5.put(37, (float) 66.6);
		r5.put(null, (float) 36.6);
		r5.put(67, (float) 16.6);
		r5.put(null, (float) 56.6);//allowed only one last null value
		r5.put(98, (float) 96.6);
		System.out.println(r5);

		
	}

}

// linked hash map is insertion order
// duplicate value are allowed
