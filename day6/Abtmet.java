package day6;
abstract class a{
	public abstract void hello();
	public void hai() {
		
	}
}
class Mk extends a{
	public void hello() {
		System.out.println("Hello");
		}
}
public class Abtmet {
	public static void main(String[] args) {
		Mk obj = new Mk();
		obj.hello();
		
	}

}
