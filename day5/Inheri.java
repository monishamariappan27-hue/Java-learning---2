package day5;
class Stu {
    void detail() {
        System.out.println("Name : Monisha");
    }
}
class Mark extends Stu {
    void mark() {
        System.out.println("AI Mark: 81");
        System.out.println("ML Mark: 92");
        System.out.println("CN Mark: 89");
    }
}
class Result extends Mark {
    void res() {
        System.out.println("Total mark: 262");
    }
}
public class Inheri {
    public static void main(String[] args) {
        Result obj4 = new Result();
        obj4.detail();
        obj4.mark();
        obj4.res();
    }
}