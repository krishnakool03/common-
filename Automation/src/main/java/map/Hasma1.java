package map;

import java.util.HashMap;
import java.util.Map;

public class Hasma1 {
	public static void main(String[] args) {
		Map <Integer,String> gr = new HashMap <Integer,String> ();
		gr.put(3, "gopal");
		gr.put(32, "ravi");
		gr.put(83, "viky");
		gr.put(33, "gopal");
		gr.put(null, "ram");
		gr.put(0, "dnesh"); 
		gr.put(null, "dnesh");
		//System.out.println("hash map:"+ gr);
	    

	      

	}

}
 
// Hashmap is random order
// key will allow only one null value (last value) 
// value will allow duplicate value