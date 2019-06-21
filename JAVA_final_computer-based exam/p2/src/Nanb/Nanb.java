public class Nanb {

	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];

		int[] counter_for_recording_how_many_number = new int[20];
		int A_count = 0;
		int B_count = 0;

		for (int i = 0; i < 20; i++) { // initialize the array
			counter_for_recording_how_many_number[i] = 0;
		}

		for (int i = 0; i < s1.length(); i++) // compare position and number right or not
		{
			if (s1.charAt(i) == s2.charAt(i)) {
				A_count++;
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			counter_for_recording_how_many_number[(s1.charAt(i) - '0')] = 1; // for recording what number we DO have
		}

		for (int i = 0; i < s1.length(); i++) { // Count for B!

			if (counter_for_recording_how_many_number[s2.charAt(i) - '0'] == 1) { // when the same index we find it is
																					// 1!
				if (s1.charAt(i) != s2.charAt(i)) { // but can't satisfy the A's requirement
					counter_for_recording_how_many_number[s2.charAt(i) - '0'] = 0;
					B_count++;
				}

			}
		}
		System.out.println(A_count + "A" + B_count + "B");
	}
}
