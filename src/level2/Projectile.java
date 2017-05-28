package level2;

import java.awt.Color;
import java.awt.Graphics;

public class Projectile extends GameObject{
	public static int speed=10;
	int x;
	int y;
	int height;
	int width;
	public Projectile(int x,int y,int height,int width){
		super();
		speed = 10;
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;	
	}
	void update(){
		super.update();
		y=y-speed;
		if(y<0){
			isAlive=false;
		}
	}
	void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);
	}
}
