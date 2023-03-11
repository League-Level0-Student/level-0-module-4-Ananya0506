package _99_extra.hide_the_creeper;

import processing.core.PApplet;
import processing.core.PImage;


public class HideTheCreeper extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
PImage creeper;
PImage minecraft;   
@Override
    public void settings() {   
    	size(WIDTH, HEIGHT);
   int x= 590;
   int y=200;
}

    @Override
    public void setup() {
    minecraft = loadImage("garden.jpg");     
    	minecraft.resize(width, height);          
    	background(minecraft);
    
    	creeper = loadImage("creeper.png");     
          creeper.resize(5,5);
   
    
    }

    @Override
    public void draw() {
    	background(minecraft);
    	image(creeper, 120, 150);
   fill(250,0,0);
    	ellipse(mouseX,mouseY,5,5);
    
    }
    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
