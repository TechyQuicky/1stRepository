import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Airline implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton exit;
	JButton reserve;
	JButton join;
	JLabel title;
	JLabel aboutus;
	Image image1;
	
	
	public Airline() {

		frame = new JFrame("Airline Reservation Program");
		panel = new JPanel();
		exit = new JButton("Exit");
		reserve = new JButton("Reserve");
		join = new JButton("Sign up/Sign in");
		title = new JLabel("Welcome to National Airlines Offical Reservation App");
		aboutus = new JLabel("We are a global airlines operating out of many countries around the world. This is our reservation app where you can reserve and seat on one of our thousands of flights daily. You can also upgrade your seats here and become an offical national airlines member! Our app is very easy to use and is 100% safe and reliable. If you have any questions/concerns or need any help you can always email us or use our online help chatbox to be assisted with a fellow staff member.");
		panel.setLayout(null);
		
		title.setFont(new Font("Arial", Font.BOLD, 30)); 
		title.setBounds(325,10,800,100);

		exit.addActionListener(this);
		exit.setBounds(450,1000,175,90);
		exit.setFocusable(false);
		
		reserve.addActionListener(this);
		reserve.setBounds(750,1000,175,90);
		reserve.setFocusable(false);
		
		aboutus.setFont(new Font("Arial", Font.BOLD, 18));
		aboutus
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(1500,1200);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(aboutus);
		panel.add(exit);
		panel.add(join);
		panel.add(reserve);
		panel.add(title);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == exit) {
			frame.dispose();
		}
		
	}
	
}
