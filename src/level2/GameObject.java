package level2;

import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
void update(){
	x++;
}
void draw(Graphics G){
	G.fillRect(x, y, 100, 100);
}
}
