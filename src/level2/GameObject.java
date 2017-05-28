package level2;

import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	public Rectangle collisionBox;
	public boolean isAlive=true;
	public final int speed = 5;
	public int x=220;
	public int y=700;
	int width;
	int height;
	GameObject(){
		collisionBox=new Rectangle(x,y,width,height);
	}
void update(){
	collisionBox.setBounds(x,y,width,height);
}
void draw(Graphics G){
	
}
}
