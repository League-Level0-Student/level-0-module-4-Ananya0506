package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 
 
 
 face = loadImage("face.jpg");
 
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	int leftEyeX = 200;
	int leftEyeY = 275;
	int rightEyeX = 575;
	int rightEyeY = 275;
	int EyeRadius = 100;

	int leftPupilX, leftPupilY, rightPupilX, rightPupilY;
	PImage face;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		face = loadImage("OMG.jpg");
		face.resize(WIDTH, HEIGHT);
		background(face);
	}

	@Override
	public void draw() {
		System.out.println(rightPupilX);
		System.out.println(rightPupilY);
		background(face);
		fill(255, 255, 255);
		ellipse(leftEyeX, leftEyeY, 2 * EyeRadius, 2 * EyeRadius);
		ellipse(rightEyeX, rightEyeY, 2 * EyeRadius, 2 * EyeRadius);
		fill(0, 0, 0);

		if (mouseX > 250) {
			leftPupilX = 250;
		} else if (mouseX < 150) {
			leftPupilX = 150;
		} else {
			leftPupilX = mouseX;
		}
		if (mouseY > 325) {
			leftPupilY = 325;
		} else if (mouseY < 215) {
			leftPupilY = 215;
		} else {
			leftPupilY = mouseY;
		}
		if (mouseX > 250) {
			rightPupilX = 250;
		} else if (mouseX <150) {
			rightPupilX = 150;
		} else {
			rightPupilX = mouseX;
		}
		if (mouseY > 325) {
			rightPupilY = 325;
		} else if (mouseY < 215) {
			rightPupilY = 215;
		} else {
			rightPupilY = mouseY;
		}
		ellipse(leftPupilX, leftPupilY, 100, 100);
		ellipse(rightPupilX+375, rightPupilY, 100, 100);

	}

	static public void main(String[] args) {
		PApplet.main(GooglyEyes.class.getName());
	}
}
