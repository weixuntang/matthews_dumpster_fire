package matwx.dumpster.fire.Dumpster;

public class FizzBuzz {
	
	public static void main(String [] args) {
		
		
		//fizzBuzz(1000);
		
		fizzBuzz0(1000);
		
	}

	
	public static void fizzBuzz0(int n) {
		// Write your code here
		int totalNum = n;

		for (int digit = 1; digit <= totalNum; digit++) {

			boolean multipleOfThree = 0 == digit % 3;

			boolean multipleOfFive = 0 == digit % 5;

			if (!multipleOfThree && !multipleOfFive) {
				System.out.println(digit);
			} else {
				if (multipleOfFive && multipleOfThree) {
					System.out.println("FizzBuzz");
				} else if (multipleOfFive) {
					System.out.println("Buzz");
				} else if (multipleOfThree) {
					System.out.println("Fizz");
				}
			}

		}

	}
	
	
	
	public static void fizzBuzz1(int n) {

		int totalNum = n;

		StringBuilder concatenatedString = new StringBuilder();

		for (int digit = 1; digit <= totalNum; digit++) {

			boolean multipleOfThree = 0 == digit % 3;

			boolean multipleOfFive = 0 == digit % 5;

			if (!multipleOfThree && !multipleOfFive) {
				concatenatedString.append(Integer.toString(digit) + ",");
			} else {
				if (multipleOfFive && multipleOfThree) {
					concatenatedString.append("FizzBuzz" + ",");

				} else if (multipleOfFive) {
					concatenatedString.append("Buzz" + ",");

				} else if (multipleOfThree) {
					concatenatedString.append("Fizz" + ",");

				}
			}
		}

		System.out.println(concatenatedString);

	}
}
