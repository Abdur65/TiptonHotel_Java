package bookingWin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accom {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accom window = new Accom();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1336, 705);
		frame.getContentPane().setBackground(new Color(0x87CEEB));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("family.jpg"));
		lblNewLabel.setBounds(24, 25, 232, 106);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel familylb = new JLabel("<HTML><strong>Family suite</strong><br>Attractively ornamented with complete marble & tiles and luxurious "
				+ "fabrics, our Family Rooms are 650 sq ft. The family rooms offer the ultimate convenience packaged into a bright, airy,"
				+ " naturally lit accommodation with two single beds"
				+ " and two seperate bathrooms.<br>Capacity: 4 people<br><strong>$210 per night</strong><HTML>");
		familylb.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		familylb.setVerticalAlignment(SwingConstants.TOP);
		familylb.setBounds(266, 25, 726, 112);
		frame.getContentPane().add(familylb);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("delux.jpg"));
		lblNewLabel_2.setBounds(24, 148, 232, 106);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel deluxelb = new JLabel("<HTML><strong>Deluxe suite</strong><br>Attractively ornamented with complete marble & tiles"
				+ "and luxurious fabrics, our Deluxe Room are 470 sq ft.All the delux rooms are furnished with latest technology "
				+ "including, LED Smart Television set, universal plugs, high-speed internet access, a safe and various entertainment features."
				+ "<br> Capacity: 2 people<br><strong>$150 per night</strong><HTML>");
		deluxelb.setVerticalAlignment(SwingConstants.TOP);
		deluxelb.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		deluxelb.setBounds(266, 148, 726, 112);
		frame.getContentPane().add(deluxelb);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("royal.jpg"));
		lblNewLabel_2_1.setBounds(24, 271, 232, 106);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel royallb = new JLabel("<HTML><strong>Royal suite</strong><br>Attractively ornamented with complete marble & tilesand "
				+ "luxurious fabrics, our Royal Rooms are 1450 sq ft. It is fixed with the latest 3D Televsion. Consists a of balcony, a "
				+ "fully equipped modern kitchen, two fully marble bathrooms with seperate bath and shower enclosure."
				+ "<br> Capacity: 4 people<br><strong>$470 per night</strong><HTML>");
		royallb.setVerticalAlignment(SwingConstants.TOP);
		royallb.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		royallb.setBounds(266, 271, 726, 112);
		frame.getContentPane().add(royallb);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(21, 137, 971, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 258, 971, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(24, 381, 971, 2);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setIcon(new ImageIcon("exec.jpg"));
		lblNewLabel_2_1_1.setBounds(24, 390, 232, 112);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(24, 505, 971, 2);
		frame.getContentPane().add(separator_1_2);
		
		JLabel Executivelb = new JLabel("<HTML><strong>Executive suite</strong><br>Attractively ornamented with complete marble"
				+ " & tilesand luxurious fabrics, our Executive Rooms are 580 sq ft.The rooms each have oversized work desks which are "
				+ "equipped with all office supplies for the guests' convinience. It comes with latest technology LED Television and"
				+ " various entertainment features."
				+ "<br> Capacity: 3 people<br><strong>$170 per night</strong><HTML>");
		Executivelb.setVerticalAlignment(SwingConstants.TOP);
		Executivelb.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		Executivelb.setBounds(266, 390, 726, 112);
		frame.getContentPane().add(Executivelb);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setIcon(new ImageIcon("pres2.jpg"));
		lblNewLabel_2_1_1_1.setBounds(24, 513, 232, 112);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JSeparator separator_1_2_1 = new JSeparator();
		separator_1_2_1.setBounds(21, 631, 971, 2);
		frame.getContentPane().add(separator_1_2_1);
		
		JLabel Presilb = new JLabel("<HTML><strong>Presidential suite</strong><br>Attractively ornamented "
				+ "with complete marble & tilesand luxurious fabrics, our our Presidential Rooms are 1900 sq ft and 1800 sq ft."
				+ " One of the rooms has a king-sized bed with a 42' LED Televison and the other with two beds and a 32' Televsion. "
				+ "There are two seperate bathrooms and large balcony with a mesmerising view."
				+ "<br> Capacity: 6 people<br><strong>$940 per night</strong><HTML>");
		Presilb.setVerticalAlignment(SwingConstants.TOP);
		Presilb.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		Presilb.setBounds(266, 513, 726, 112);
		frame.getContentPane().add(Presilb);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(1064, 25, 2, 610);
		frame.getContentPane().add(separator_2);
		
		JButton bookbutn = new JButton("Book a room");
		bookbutn.setFocusable(false);
		bookbutn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Booking();
				Booking.main(null);
			}
		});
		bookbutn.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		bookbutn.setForeground(Color.WHITE);
		bookbutn.setBackground(new Color(0x000E80));
		bookbutn.setBounds(1102, 304, 188, 73);
		frame.getContentPane().add(bookbutn);
	}
}
