package tcrjava.leetcode.string;

public class FindConsonentAndVowolsInWord {

	public static void main(String[] args) {

		String input = "lingadharan";
		String vowols = "aeiou";

		long count = input.chars().mapToObj(ch -> (char) ch).filter(vow -> {
			if (vow == 'a' || vow == 'e' || vow == 'i' || vow == 'o' || vow == 'u') {
				return false;
			} else {
				return true;
			}
		}).count();
		System.out.println(count);
	}

}
