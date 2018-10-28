package question7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringOperations {

	public static void main(String[] args) {

		List<String> strObject = new ArrayList<String>();

		strObject.add("java8");
		strObject.add("java8 and ");
		strObject.add("");
		strObject.add("");
		strObject.add("java8 all");
		strObject.add("java7hb");
		strObject.add("java7hb");
		strObject.add("java7hb");
		strObject.add("java7hb");
		strObject.add("");
		strObject.add("");

		List<String> emptyStringList = (strObject.stream().filter(s -> s.isEmpty()).collect(Collectors.toList()));
		int nonEmptyStringList = (strObject.stream().filter(s -> s.length() > 5).collect(Collectors.toList()).size());

		System.out.println("No of empty string is : " + emptyStringList.size());
		System.out.println("No of string whose lenght is >5 : " + nonEmptyStringList);

	}
}
