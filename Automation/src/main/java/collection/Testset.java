package collection;

import java.util.HashSet;
import java.util.Set;

public class Testset {
	public static void main(String[] args) {
		Set<Integer> nt = new HashSet<Integer>();
		nt.add(20);
		nt.add(70);
		nt.add(20);
		nt.add(60);
		nt.add(26);
		nt.add(70);
		nt.add(10);
		nt.add(90);
System.out.println(nt);

	}

}
//set is value based
// hashset is random order
// not allowd duplicate value
