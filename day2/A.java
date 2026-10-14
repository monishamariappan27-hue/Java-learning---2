package day3;

public class A {
	static int a=10;
	public static void a() {
		System.out.println(a);
	}
	static {
		System.out.println("welcome"); 
	}
	public static void main(String[] args) {
		a();
		A.a();
	}

}
