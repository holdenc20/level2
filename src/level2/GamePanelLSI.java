package level2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanelLSI extends JPanel implements ActionListener, KeyListener{
	int speed;
	RocketShip ship=new RocketShip(speed);
	
	Font title;
	Font subtitle;
final int MENU_STATE = 0;
final int GAME_STATE = 1;
final int END_STATE = 2;
int currentState=MENU_STATE;
void drawMenuState(Graphics g){
	g.setColor(Color.BLUE);
	g.fillRect(0, 0, LeagueSpaceInvadors.width, LeagueSpaceInvadors.height);
	g.setColor(Color.black);
	g.setFont(title); 
	g.drawString("SPACE INVADERS", 40, 100);
	g.setFont(subtitle);
	g.drawString("Press enter to start", 140, 200);
	g.drawString("Press space to see instructions", 70, 300);
}
void drawGameState(Graphics g){
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, LeagueSpaceInvadors.width, LeagueSpaceInvadors.height);
	ship.draw(g);
}
void drawEndState(Graphics g){
	g.setColor(Color.RED);
	g.fillRect(0, 0, LeagueSpaceInvadors.width, LeagueSpaceInvadors.height);
	g.setColor(Color.LIGHT_GRAY);
	g.setFont(title);
	g.drawString("GAME OVER", 100, 100);
	g.setFont(subtitle);
	g.drawString("Press enter to go to start", 110, 200);
}
void updateMenuState(){
	
}
void updateGameState(){
	ship.update();
}
void updateEndState(){
	
}
Timer timer=new Timer(1000/60,this);
GameObject gameobject;
GamePanelLSI(){
	
	subtitle=new Font("Arial",Font.ITALIC,25);
	title = new Font("Arial",Font.BOLD,48);
	gameobject=new GameObject();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	
	if(currentState == MENU_STATE){
		updateMenuState();
	}else if(currentState == GAME_STATE){
		updateGameState();
	}else if(currentState == END_STATE){
		updateEndState();
	}
	gameobject.update();
	repaint();
}
void startGame(){
	timer.start();
}
public void paintComponent(Graphics g){
		if(currentState == MENU_STATE){
		drawMenuState(g);
	}else if(currentState == GAME_STATE){
		drawGameState(g);
	}else if(currentState == END_STATE){
		drawEndState(g);
	}
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("keyTyped");
}
@Override
public void keyPressed(KeyEvent e) {
	if(currentState==1 && e.getKeyCode()==KeyEvent.VK_LEFT){
		System.out.println("s");
		ship.x=ship.x+speed;
	}
	// TODO Auto-generated method stub
	if(currentState<3 && e.getKeyCode() == KeyEvent.VK_ENTER){
		
		if(currentState==0 || currentState==1)currentState++;
		else{
			currentState=0;
		
		}
	}
	System.out.println("keyPressed");
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("KeyReleased");
	
}

}
