package day5;
class Grand{
	void land() {
		System.out.println("land");
	}
}
class Mother extends Grand{
	public static void work() {
		System.out.println("work");
	}	
}
class Daugt extends Mother{
	int b= 20;
	public static void play() {
		int b= 20;
		System.out.println("Play");
		}
}

public class Multilev {
	public static void main(String[] args) {
		Daugt obj = new Daugt();
		obj.land();
		obj.work();
		obj.play();
		Mother obj1 = new Mother();
		obj1.land();
		obj1.work();
		Grand obj2 = new Grand();
		obj2.land();
		System.out.println(obj.b);   
	}

}
