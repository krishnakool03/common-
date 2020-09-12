package collection;

import java.util.LinkedList;
import java.util.List;

public class Testal {
	public static void main(String[] args) {
		List  d10 = new LinkedList();
		d10.add( 10);
		d10.add(3.5);
		d10.add("String");
		d10.add( true);
		d10.add(3737);
		//d10.add(1,"selva");
		d10.set(1, "gopal");
		//System.out.println(d10);
		//System.out.println(d10.size());
		//System.out.println(d10.get(5));

		for(int i=0;i<d10.size();i++) {
			System.out.println(d10.get(i));
		}

	}

}
