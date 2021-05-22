package matwx.dumpster.fire.Dumpster;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortArrayOfNum(151,5151,84848,4848,848);
	}
	
	
	public static void sortArrayOfNum(Integer... randomNumbers) {

		DecimalFormat df3 = new DecimalFormat("#.###");

		List<Integer> numbers = Arrays.asList(randomNumbers);
		Collections.sort(numbers);

		double totalSum = 0;

		for (int num : numbers) {
			totalSum += num;
		}

		double average = totalSum / (randomNumbers.length);

		System.out.println("Minimum : " + numbers.get(0));
		System.out.println("Average : " + df3.format(average));
		System.out.println("Maximum : " + numbers.get(randomNumbers.length - 1));

	}

}
