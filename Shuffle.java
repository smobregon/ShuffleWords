import java.util.Scanner;

public class Shuffle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first word: ");
		String firstWord = sc.nextLine().toUpperCase();

		System.out.print("Enter the second word: ");
		String secondWord = sc.nextLine().toUpperCase();

		if (firstWord.length() == secondWord.length()) {
			System.out.print("The shuffle output is ");

			for (int i = 0, length = firstWord.length(); i < length; i++) {
				System.out.print(firstWord.charAt(i));
				System.out.print(secondWord.charAt(i));
			}
			System.out.println();

		} else {

			System.out.println("Invalid inputs, please enter two words of the same length\n");
			main(new String[0]);

		}

	}

}