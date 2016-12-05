package level2;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	public static int speed=10;
	public Projectile(int x,int y,int height,int width){
		speed = 10;
		this.x=x;
		this.y=y;
		height=10;
		width=5;	
	}
	void update(){
		y=y-speed;
		if(y<0){
			isAlive=false;
		}
	}
	void draw(Graphics G){
		G.setColor(Color.RED);
		G.fillRect(x, y, width, height);
	}
}
