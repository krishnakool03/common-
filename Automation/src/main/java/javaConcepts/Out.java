package javaConcepts;

public class Out extends Astract {

	@Override
	void test() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	@Override
	void test2() {
		// TODO Auto-generated method stub
		System.out.println("two");

	}

	@Override
	void test3() {
		// TODO Auto-generated method stub
		System.out.println("three");

	}

	@Override
	void test5() {
		// TODO Auto-generated method stub
		System.out.println("four");

	}
	public static void main(String[] args) {
		Out f5 = new Out();
		f5.test();
		f5.test2();
		f5.test5();
		f5.test3();
	}

}
