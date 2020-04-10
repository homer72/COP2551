import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Animation extends JFrame{
	MyPane pane;
	JButton button = new JButton("Move it");
	public Animation() {
		setSize(400,400);
		getContentPane().setLayout(null);
		pane = new MyPane();
		pane.setSize(400,400);
		pane.setVisible(true);
		getContentPane().add(pane);
		button.setSize(100,100);
		getContentPane().add(button);
		setVisible(true);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pane.x > pane.getSize().width - 60 ) {
					pane.direction = !pane.direction;
				}
				if(pane.x < 0 ) {
					pane.direction = !pane.direction;
				}
				if(pane.direction) {
					pane.x += 10;
				}else {
					pane.x -= 10;
				}
				pane.repaint();
			}
		});
	}
	
	
}

class MyPane extends JPanel implements Runnable{
	int x=100,y=60;
	boolean direction = true;
	Thread t;
	public MyPane() {
		t = new Thread(this);
		t.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.fill3DRect(x, 10, y, y, true);
		g.drawString("Hello", 100, 10);
	}
	float move = 0;
	public void run() {
		while(true) {
			move += .1;
			
			if(x > getSize().width - 60 ) {
				direction = !direction;
			}
			if(x < 0 ) {
				direction = !direction;
			}
			if(direction) {
				x += move;
			}else {
				x -= move;
			}
			repaint();
			try {
				Thread.sleep(2);
			}catch(Exception e) {}
			if(move > 1)
				move = 0;
		}
	}
}