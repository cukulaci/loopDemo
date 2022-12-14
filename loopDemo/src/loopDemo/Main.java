package loopDemo;

public class Main {

	public static void main(String[] args) {
		// For
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü sona erdi.");

		// While

		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i = i + 3; // i++
		}

		System.out.println("While döngüsü sona erdi.");

		// Do-While
		int j = 1;
		do {
			System.out.println(j);
			j += 2;

		} while (j < 10);
		{
			System.out.println("Do-While döngüsü sona erdi.");

		}

	}

}
