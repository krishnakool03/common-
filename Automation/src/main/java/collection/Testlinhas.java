package collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Testlinhas {
	public static void main(String[] args) {
		Set<Float> n3 =new LinkedHashSet<Float> ();
		n3.add((float) 10.4);
		n3.add((float) 17.9);
		n3.add((float) 17.9);
		n3.add((float) 89.5);
		n3.add((float) 64.3);
		n3.add((float) 9.3);
		n3.add((float) 6.7);

		System.out.println(n3);
		
	}

}
// insertion order
// not allowed duplicate value
