package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String score = JOptionPane.showInputDialog("what is your test score?");
int scory = Integer.parseInt(score);
	double test = scory;
if (test<=30) {
	JOptionPane.showMessageDialog(null," you get an F!!! you really need to do better next time, or you're gonna have to REPEAT THE GRADE!!!!");
}
if (test<=50 && test>30) {
	JOptionPane.showMessageDialog(null," you get a E!!! make sure you double check your work and try harder!");
}
if (test<=65 && test>50) {
	JOptionPane.showMessageDialog(null," you get a D!!! Could've been worse, but you really need to turn these grades around!");
}
if (test<=75 && test>65) {
	JOptionPane.showMessageDialog(null," you get a C!!! most of your answers were right, but you have to show your work better!");
}
if (test<=90 && test>75) {
	JOptionPane.showMessageDialog(null," you get a B!!! you were almost at the top, but there were some minor problems. better luck next time!!!");
}
if (test<=100 && test>90) {
	JOptionPane.showMessageDialog(null," you get an A!!! your work was perfect from every angle! keep up the good work! ");
}
}
}
