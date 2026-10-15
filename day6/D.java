package day6;
class Ab{
	int a=10;
}
public class D extends Ab{
	int a=20;
	void a() {
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		D obj = new D();
		obj.a();

	}

}
