package level2;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{
	Graphics G;
public RocketShip(int speed){
	super();
	speed=5;
	x=220;
	y=700;
	height=30;
	width=60;
}
void update(){
	super.update();
}
void draw(Graphics G){
	G.setColor(Color.BLUE);
	G.fillRect(x, y, width, height);
}
}
