package williamHillsLibrary;

public class A implements Test2,Test1{

	public static void main(String[] args) {
		
		Abc obj=new Abc();
		obj.getB();
		System.out.println("getB()="+obj.getB());
	}

	public void test2method3() {
		System.out.println("Interface 2 method 3");
		
	}

	public void test2method4() {
		System.out.println("Interface 2 method 4");
		
	}

	public void test1method() {
		System.out.println("Interface 1 method 1");
		
	}

	public void test1method2() {
		System.out.println("Interface 1 method 2");
		
	}

}
