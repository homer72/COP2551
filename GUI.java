import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.*;

public class GUI extends JFrame {
	JButton button, button2;
	JTextField tf;
	Random rand;
	Character player = new Character();
	Monster vader = new Monster((byte) 100, 10, 10, "Vader");
	Story storyline = new Story();

	public GUI() {
		rand = new Random();
		button = new JButton("Start");
		tf = new JTextField("Enter Name       ");
		getContentPane().add(tf);
		getContentPane().add(button);
		getContentPane().setLayout(new FlowLayout());
		setSize(600, 600);
		setVisible(true);

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				player.setName(text);
			}
		});

		/*
		 * // Intro storyline.intro(player); boolean alive = storyline.part2();
		 * 
		 * 
		 * // Part 3: Made a left turn! alive = storyline.part3(player, vader);
		 * 
		 * 
		 * Examples button.addActionListener(new ActionListener(){ public void
		 * actionPerformed(ActionEvent e){ String text = tf.getText();
		 * if(text.equals("Move")) { setLocation(100,100); } } });
		 * 
		 * button.addMouseListener(new MouseListener(){ public void
		 * mousePressed(MouseEvent e){ } public void mouseClicked(MouseEvent e){ }
		 * public void mouseExited(MouseEvent e){ } public void mouseReleased(MouseEvent
		 * e){ } public void mouseEntered(MouseEvent e){ int x = rand.nextInt(700); int
		 * y = rand.nextInt(700); setLocation(x,y); } });
		 */

	}

}
