package tiptonhotel;

import javax.swing.*;
import javax.swing.border.Border;

import bookingWin.AboutUs;
import bookingWin.Accom;
import bookingWin.FaciWin;

import java.awt.*;
import java.awt.event.*;


public class HomePage extends JFrame implements ActionListener{

	JButton roombook, contact, facility, about;
	ImageIcon bgimg, home, logo;
	JLayeredPane bgpanel, selectpanel;
	JLabel bglabel, selectlabel, head;
	
	HomePage()
	{
		Font font = new Font("Bahnschrift SemiBold",Font.ITALIC, 30);
		Font bfont = new Font("Comic Sans", Font.BOLD, 15);
		Font hfont = new Font("Lucida Calligraphy", Font.BOLD, 30);
		Border border = BorderFactory.createLineBorder(Color.black);
		bgimg = new ImageIcon("Skyscrappers.jpg");
		logo = new ImageIcon("logo.jpg");
		home = new ImageIcon("rsz_1homepage2.jpg");
		bgpanel = new JLayeredPane();
		bglabel = new JLabel();
		head = new JLabel();
		selectlabel = new JLabel();
		roombook = new JButton();
		facility = new JButton();
		contact = new JButton();
		about = new JButton();
		
		roombook.setBounds(400, 150, 200, 50);
		roombook.setFocusable(false);
		roombook.setText("Accomodation");
		roombook.setFont(bfont);
		roombook.addActionListener(this);
		
		facility.setBounds(400, 220, 200, 50);
		facility.setFocusable(false);
		facility.setText("Facilities and Services");
		facility.setFont(bfont);
		facility.addActionListener(this);
		
		contact.setBounds(400, 290, 200, 50);
		contact.setFocusable(false);
		contact.setText("Help");
		contact.setFont(bfont);
		contact.addActionListener(this);
		
		about.setBounds(400, 360, 200, 50);
		about.setFocusable(false);
		about.setText("About");
		about.setFont(bfont);
		about.addActionListener(this);

		
		
		head.setOpaque(true);
		head.setBackground(new Color(0x87CEEB));
		head.setBounds(150,80,700,50);
		head.setBorder(border);
		head.setText("-----------WELCOME TO THE TIPTON-----------");
		head.setFont(hfont);
		
		bglabel.setOpaque(true);
		bglabel.setIcon(bgimg);
		bglabel.setBounds(0,0,1000,600);
		
		selectlabel.setOpaque(true);		
		selectlabel.setIcon(home);
		selectlabel.setBounds(150, 100, 700, 400);
		
		bgpanel.setBounds(0,0,1000,600);
		
		bgpanel.add(head);
		bgpanel.add(selectlabel);
		bgpanel.add(bglabel);
		selectlabel.add(roombook);
		
		this.setTitle("Tipton Hotel Reservation");
		this.setIconImage(logo.getImage());
		this.add(contact);
		this.add(about);
		this.add(facility);
		this.add(roombook);
		this.add(bgpanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 600);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == facility)
		{
			new FaciWin();
			FaciWin.main(null);
		}
		if(e.getSource() == roombook)
		{
			//this.dispose();
			new Accom();
			Accom.main(null);
		}
		if(e.getSource() == about)
		{
			new AboutUs();
			AboutUs.main(null);
		}
		if(e.getSource() == contact)
		{
			new HelpWindow();
		}
		
		
	}

}
