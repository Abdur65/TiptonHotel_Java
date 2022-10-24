package bookingWin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;

public class AboutUs {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUs window = new AboutUs();
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
	public AboutUs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon logo = new ImageIcon("logo.jpg");

		frame = new JFrame();
		frame.setIconImage(logo.getImage());
		frame.setBounds(100, 100, 719, 518);
		frame.getContentPane().setBackground(new Color(0x87CEEB));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		
		
		JLabel lblNewLabel = new JLabel("About Us");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(272, 11, 140, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 54, 590, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("<HTML><strong>Tipton Hotel</strong> is a privately owned 5 Star Standard Luxury Hotel in Aspen Colarado, USA."
				+ " It is situated in an attractive location near rocky mountains. It is a place of choice of most of the corporate"
				+ " executives, foreigners, and for those who prefer to stay in luxury with stunning views. The Hall of Stars has "
				+ "the capacity of 1500 persons, we also have another 3 (three) different capacitated halls, Andromeda, Level-9 and"
				+ " Board Meeting Room which are also ideal for business conference and musical party. The Conference Center is "
				+ "fully equipped with a wide range of presentation equipments; multimedia projector, overhead projector, slide "
				+ "projector, projection screen, comprehensive sound system with coat and wireless microphones, TV, computers and so on."
				+ " <br>Apart from the above services we have other value added services that ensure the Five Star satisfaction to our "
				+ "honorable guests. We provide 24 hours front desk & room services, business & secretarial services, laundry & valet "
				+ "services, Multi-cuisine Restaurant, BBQ restaurant, Coffee & Pastry shop, Pool terrace, Swimming pool, Fitness "
				+ "Center, Tennis court, Fitness center, Billiard , Gift shop, 24 hours CC TV, emergency doctor and limousine "
				+ "service. Besides those, we could provide more than 300 cars parking to our respectable guests. Therefore, we are "
				+ "looking forward to becoming your hospitality partner as we can ensure you a lavish accommodation, luxury comfort, "
				+ "extensive security, world class cuisine, contemporary conference facilities as well as splendid views.</HTML>");
		lblNewLabel_1.setFont(new Font("Bahnschrift", Font.ITALIC, 15));
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setBounds(62, 67, 590, 359);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(62, 437, 590, 2);
		frame.getContentPane().add(separator_1);
	}
}
