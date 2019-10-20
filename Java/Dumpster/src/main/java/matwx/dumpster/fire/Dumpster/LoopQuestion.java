package matwx.dumpster.fire.Dumpster;

import java.util.ArrayList;
import java.util.List;

/**
 * Loop Question Solution
 *
 */
public class LoopQuestion {
	public static void main(String[] args) {

		List<String> listOfWords = loopQuestion();

		for (int i = 0; i < listOfWords.size(); i++) {
			listOfWords.set(i, cleanse(listOfWords.get(i)));
		}

		for (String word : listOfWords) {
			System.out.println(word);
		}

	}

	public static List<String> loopQuestion() {
		ArrayList<String> listOfWords = new ArrayList<>();
		listOfWords.add("1_A_1");
		listOfWords.add("P_2_2");
		listOfWords.add("3_3_P");
		listOfWords.add("4_L_4");
		listOfWords.add("5_5_E");
		return listOfWords;
	}

	public static String cleanse(String inputs) {
		return inputs.replaceAll("\\P{L}+", "");
	}
}
