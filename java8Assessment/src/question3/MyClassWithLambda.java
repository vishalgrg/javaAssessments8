package question3;

public class MyClassWithLambda {

	public static void main(String[] args) {

		WordCount wordCount = (str) -> {

			return str.length();
		};

		System.out.println("words.." + wordCount.count("java 8 features"));

	}

}
