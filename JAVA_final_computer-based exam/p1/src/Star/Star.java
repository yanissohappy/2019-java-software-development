import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		int length = 2 * input - 1;
		int star_position = input;

		int i = 0;
		int j = 0;
		while (i < input - 1) {
			j = 0;
			while (j < length) {
				if (j == star_position - 1 || j == length - (star_position)) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
				j++;
			}
			star_position--;
			System.out.println();
			i++;
		}

		for (; length > 0;) {
			System.out.print("*");
			length--;			
		}
	}
}
