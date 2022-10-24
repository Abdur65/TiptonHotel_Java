package tiptonhotel;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class HelpWindow extends JFrame{
	
	
	HelpWindow()
	{
		ImageIcon logo = new ImageIcon("logo.jpg");
		JLabel help = new JLabel();
		Font font = new Font("Lucida Sans",Font.PLAIN, 16);
		Border border = BorderFactory.createLineBorder(Color.black, 5);
		
		help.setOpaque(true);
		help.setBackground(new Color(0x87CEEB));
		help.setBounds(0, 0, 735, 132);
		help.setVerticalAlignment(JLabel.TOP);
		help.setFont(font);
		help.setBorder(border);
		help.setText("<HTML><h2>For any enquiries, please contact</h2>Mobile: +1 (516) 784-4567, +1 (516) 267-0203<br><br>"
				+ "Email: tiptoncolarado@yahoo.com");
		
		
		this.setTitle("Help");
		this.add(help);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(750, 170);
		this.setLayout(null);
		this.setIconImage(logo.getImage());
		this.setVisible(true);
		this.setResizable(false);
	}
}
