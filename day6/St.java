package day6;
abstract class Mark{
	public abstract void SubMark();
	public void Subject(){
		System.out.println("Data Science");
	}
}
class Tot extends Mark{
	public void SubMark() {
		System.out.println("Total mark : 120");
	}
}
public class St {
	public static void main(String[] args) {
		Tot obj = new Tot();
		obj.SubMark();
		obj.Subject();
	}

}
