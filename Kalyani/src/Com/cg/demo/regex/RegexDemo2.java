package Com.cg.demo.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {

		String regex = "[a-z]"; // any letters from a to z
		String regex1 = "[a-z]|[A-Z]|[0-9]|[@]"; // any letters from a to z

		Pattern pat = Pattern.compile(regex1);

		for (int i = 48; i <= 122; i++) {
			String input = Character.toString((char) i);
			Matcher mat = pat.matcher(input);
			System.out.println(i + " " + input + " " + mat.matches());
		}

	}
	}
