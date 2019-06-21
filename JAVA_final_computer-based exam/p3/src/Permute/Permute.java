public class Permute {

	public static void main(String[] args) {
		String s = args[0];
		String empty_string_for_initializing = "";
		permutations(empty_string_for_initializing, s);
	}

	private static void permutations(String victim, String the_rest) {
		
		if (the_rest.length() == 0) {
			System.out.println(victim);
		}
		
		int i = 0;
		while (i < the_rest.length()) {
			permutations(victim + the_rest.charAt(i), the_rest.substring(0, i) + the_rest.substring(i + 1));
			i++;
		}

	}
}
