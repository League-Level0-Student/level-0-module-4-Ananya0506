package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
         String three = ("yum");                                                                                      
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
three.charAt(2);
		
		// 3. Print the length of your String to the console.
		//    HINT: .length()
three.length();
		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		for(int i=0; i<three.length(); i++) {
			System.out.println(three.charAt(i));
		}
		// 5. Pick a char inside your String, and use a for loop to determine
		//    what position/index in the String the char is located.    
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
		
	for (int a=0; a < three.length(); a++) {
			System.out.println("u is at index 1");
		}
		
		
	}
}


