package day5;
class Father{
	public static void work() {
		System.out.println("work");
	}
	public static void land() {
		System.out.println("land");
	}
	
}
class Son extends Father{
	public static void play() {
		int b= 20;
		System.out.println("Play");
		}
}
public class SinInt {

	public static void main(String[] args) {
		Son obj = new Son();
		obj.work();
		obj.play();
		obj.land();


	}

}
