import java.util.*;

class Pract1A{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert a number: ");
		int a = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
		System.out.println(a + " * " + i + " = " + a * i);
		}
	}
}