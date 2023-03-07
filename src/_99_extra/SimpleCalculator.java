package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {
for(int i=0; i<1000000000; i++);
		// 1. Get 2 numbers from the user and convert them to integer.
String num1 = JOptionPane.showInputDialog("enter your first number.");
String num2 = JOptionPane.showInputDialog("enter your second number.");

int nummy1 = Integer.parseInt(num1);
int nummy2 = Integer.parseInt(num2);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "enter the operation that you want to use.", "Operation Option", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "addition", "subtraction", "multiplication", "division" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
if (operation==0) {
JOptionPane.showMessageDialog(null, add(nummy1,nummy2));	
} else if (operation==1) {
	JOptionPane.showMessageDialog(null, subtract(nummy1,nummy2));
} else if (operation==2) {
	JOptionPane.showMessageDialog(null, multiply(nummy1,nummy2));
} else if (operation==3) {
	JOptionPane.showMessageDialog(null, divide(nummy1,nummy2));
}
	
	}
	
	
	// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
		


	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
static int add(int nummy1, int nummy2) {
	return nummy1+nummy2;
}
static int subtract(int nummy1, int nummy2) {
	return nummy1-nummy2;
}
static int multiply(int nummy1, int nummy2) {
	return nummy1*nummy2;
}
static int divide(int nummy1, int nummy2) {
	return nummy1/nummy2;
}
	// 4. Create similar methods for subtraction, multiplication and division.
}