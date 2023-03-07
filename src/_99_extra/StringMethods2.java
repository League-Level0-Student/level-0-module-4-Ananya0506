package _99_extra;


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
String random = "funnybunny";
		// 2. Print your String to the console in upper case.
		System.out.println(random.toUpperCase());
		// 3. Print your String to the console in lower case.
		System.out.println(random.toLowerCase());
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		System.out.println(random.substring(0, 3));
		// 5. Print a single char somewhere in the middle of your String
		System.out.println(random.substring(5, 6));
		
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
	random.length();
	System.out.println(random.substring(7, 10));
	}
}
