package level2;

import javax.swing.JFrame;

public class LeagueSpaceInvadors {
	//variables
	LeagueSpaceInvadors lsi;
	JFrame frame=new JFrame();
	GamePanelLSI GamePanel;
	public final static int width=500;
	public final static int height=800;

	//constructor
	LeagueSpaceInvadors(){
		GamePanel=new GamePanelLSI();
		setup();	
		}
public static void main(String[] args) {
	LeagueSpaceInvadors lsi=new LeagueSpaceInvadors();;
}
//makes the frame
public void setup(){
	frame.addKeyListener(GamePanel);
	frame.add(GamePanel);
	frame.setVisible(true);
	frame.setSize(width, height);
	GamePanel.startGame();
}
}
