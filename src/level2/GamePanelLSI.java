package level2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanelLSI extends JPanel implements ActionListener, KeyListener{
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState=MENU_STATE;
void drawMenuState(Graphics g){
	g.fillRect(0, 0, 500, 800);
	g.setColor(Color.BLUE);
}
void drawGameState(Graphics g){
	
}
void drawEndState(Graphics g){
	
}
void updateMenuState(){
	Graphics g = null;
	drawMenuState(g);
}
void updateGameState(){
	
}
void updateEndState(){
	
}
Timer timer=new Timer(1000/60,this);
//ameObject gameobject;
GamePanelLSI(){
	//gameobject=new GameObject();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//gameobject.update();
	repaint();
	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}
}
void startGame(){
	timer.start();
}
public void paintComponent(Graphics g){
	//gameobject.draw(g);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("keyTyped");
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("keyPressed");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("KeyReleased");
	
}

}
