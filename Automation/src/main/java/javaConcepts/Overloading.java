package javaConcepts;

public class Overloading  {
	public void Overloading(int a , int b) {
		  int c = a+b;
		  System.out.println(c);
		//
	}
	public void Overloading (int a, int b, int c) {
		int d = a+b+c;
		System.out.println(d);
	}
public static void main(String[] args) {
	Overloading f1 = new Overloading();
	f1.Overloading(2, 5);
	f1.Overloading(3, 8, 12);
	System.out.println("overloading is sucessfully");
	

}

}