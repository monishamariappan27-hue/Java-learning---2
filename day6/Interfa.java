package day6;
import java.util.Scanner;
interface Bc{
	public abstract void a();
}
interface C{
	public abstract void b();
}
public class Interfa implements Bc,C {
	public void a() {
		System.out.println("Hello");
	}
	public void b() {
		System.out.println("Hai");
	}
	public static void main(String[] args) {
		Interfa obj = new Interfa();
		obj.a();
		obj.b();
		
	}

}
