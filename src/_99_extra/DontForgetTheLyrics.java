package _99_extra;

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DontForgetTheLyrics {
	 /*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	static AudioClip audioClip;
	public static void main(String[] args) {
		// 4. Make a pop-up to explain the game.
int points = 0;
		JOptionPane.showMessageDialog(null,"welcome to Guess The Song! you will hear a song, and then you will try to guess the song.if you get it right, you get a point. get as many points as you can.");
		// 5. Use the playSound method to play your song.
playSound("whatever it takes.wav");
		// 6. Make a pop-up for the player to type their answer.
String answer = JOptionPane.showInputDialog("type your guess in the space below. format: *song* by *band or singer*."); 
		// 7. If they answered correctly, tell them that they were right.
if (answer.equalsIgnoreCase("whatever it takes by imagine dragons")) {
	JOptionPane.showMessageDialog(null, "great! you guessed it right! time for the next song guess!");
	points ++;
	audioClip.stop();
} else { 
	JOptionPane.showMessageDialog(null, "aww man, you got the answer wrong! the correct answer was 'whatever it takes by Imagine Dragons.' but it's ok, you will get another chance in the second song guess!");
audioClip.stop();
}
		// 8. Otherwise, tell them they are wrong, and give them the answer.

		// 9. Record another sound and repeat steps 5-8.
JOptionPane.showMessageDialog(null, "alright, time for another one! are you ready???");
playSound("titanium.wav");
String answer2 = JOptionPane.showInputDialog("type your guess in the space below. ");
if (answer2.equals("titanium by Sia")) {
	JOptionPane.showMessageDialog(null, "woohoo! you got it right! time for the next one!");
points ++;
audioClip.stop();
} else {
	JOptionPane.showMessageDialog(null, "off..., you got it wrong! better luck next time!");
audioClip.stop();
}
		// 10. [optional] Add a points variable that will calculate their final score.
	JOptionPane.showMessageDialog(null, "you finished this game! your score is: " + points +". nice job, and goodbye! hope you enjoyed the game!");
	System.exit(0);
	}

	public static void playSound(String fileName) {
		audioClip = JApplet.newAudioClip(new DontForgetTheLyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}


