package week1.day2;

public class LearnString {
	public static void main(String[] args) {
		//Declaration type 1 - String Literal - Faster
		String text = "TestLeaf";
		//Declaration type 2 - String Object
		String name = new String("Balaji");
		//To find the length of a string
		int length = text.length();
		System.out.println(length);
		//Case Changing
		String lowercase = text.toLowerCase();
		String upperCase = text.toUpperCase();
		System.out.println(lowercase);
		System.out.println(upperCase);
		//String Comparison
		String text1 = "Testleaf";
		String text2 = "Chennai";
//		if (text1.equals(text2)) {
		
//		if(text1.equalsIgnoreCase(text2)) {
		
		if(text1.contains(text2)) {
		System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		//String Concatination
		System.out.println(text1+text2);
		String text3 = text1+text2;
		String text4 = text1.concat(text2);
		
		System.out.println(text4);
		
		char[] array = text1.toCharArray();
		for (char eachChar : array) {
			System.out.println(eachChar);
		}
		String sentence = "Testleaf is a tech-ed Company";
		String[] split = sentence.split(" ");
		for (String eachWord : split) {
			System.out.println(eachWord);
		}
		//To trim spaces in the front and back
		String text5 = "    Testleaf is in Chennai    ";
		String trim = text5.trim();
		
		System.out.println(trim);
		System.out.println(text5);
		
		char charAt = text1.charAt(2);
		for(int i = 0;i<text1.length();i++)
		System.out.println(text1.charAt(i));
		
		
		String test = "Testleaf - 14th Division";
		String substring = test.substring(11,16);
		System.out.println(substring);
		
		
		//To Replace a particular char in a string
		String replace = test.replace('s', '$');
		System.out.println(replace);
		
		//To Replace a set or pattern of text
		String replaceAll = test.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
