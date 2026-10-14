package day2;

public class Primeno {
	public static String prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "Not a prime number";
            }
        }
        return "Prime number";
    }

	public static void main(String[] args) {
		System.out.println(prime(10));
	}
}
