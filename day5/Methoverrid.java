package day5;
/*class Allean{
	public void party() {
		System.out.println("Home");
	}
}
class Smith extends Allean{
	public void party() {
		System.out.println("Beach");
	}
}
public class Methoverrid {

	public static void main(String[] args) {
		Allean obj = new Allean();
		obj.party();
		obj=new Smith();
		obj.party();

	}

}*/
class Moni{
	public void dream() {
		System.out.println("UI&UX Designer");
	}
}
class Dad extends Moni {
	public void dream() {
		System.out.println("IT job");
	}
}
public class Methoverrid {
	public static void main(String[] args) {
		Moni obj = new Dad();
		obj.dream();

	}

}
