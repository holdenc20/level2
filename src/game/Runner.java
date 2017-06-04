package game;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Runner {
GamePanel p;
Runner r;
JFrame f=new JFrame();
public int numberOfTiles=4;
final int width=400;
final int height=400;
public Runner(){
	p=new GamePanel();
	setup();
}
public void setup(){
	f.add(p);
	
	
	f.setSize(width, height);
	f.setVisible(true);
	
}
public static void main(String[] args) {
	Runner r=new Runner();
}
}
