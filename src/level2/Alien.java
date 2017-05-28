package level2;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject{
	final int speed=1;
	int x;
	int y;
	int width;
	int height;
	int counter=0;
	int direction=1;//1=right   2=left   0=down
public Alien(int x,int y,int width,int height){
	super();
	this.x=x;
	this.y=y;
	this.width=width;
	this.height=height;
}
void update(){
	super.update();
	counter++;
	System.out.println(counter);
	if(counter%430==0 && direction==1){
		direction=2;
		y+=55;
	}
	else if(counter%430==0 && direction==2){
		direction=1;
		y+=55;
	}
	if(direction==2){
		x=x-speed;
	}
	if(direction==1){
		x=x+speed;
	}
}
void draw(Graphics g){
	g.setColor(Color.YELLOW);
	g.fillRect(x, y, width, height);
}
}
