package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements ActionListener {
	public GamePanel(){
		JButton b;
		for(int i=0;i<4;i++){
			b=new JButton();
			b.setText(""+i);
			b.addActionListener(this);
			this.add(b);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
