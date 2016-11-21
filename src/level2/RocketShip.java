package level2;

import java.awt.Color;
import java.awt.Graphics;

public class RocketShip extends GameObject{
public RocketShip(int speed){
	x=220;
	y=700;
	height=30;
	width=60;
	
}
void update(){

}
void draw(Graphics G){
	G.setColor(Color.BLUE);
	G.fillRect(x, y, width, height);
}
}
