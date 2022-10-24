package bookingWin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;

public class FaciWin {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaciWin window = new FaciWin();
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
	public FaciWin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon logo = new ImageIcon("logo.jpg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1105, 689);
		frame.getContentPane().setBackground(new Color(0x87CEEB));
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setIconImage(logo.getImage());
		
		JLabel lblNewLabel = new JLabel("Billiards");
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 20, 228, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Swimming pool");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(304, 20, 200, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblComplimentaryDrinks = new JLabel("Multi-Cuisine Restuarant");
		lblComplimentaryDrinks.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblComplimentaryDrinks.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplimentaryDrinks.setBounds(543, 20, 228, 27);
		frame.getContentPane().add(lblComplimentaryDrinks);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("bill.jpg"));
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setBounds(39, 52, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("pool02.jpg"));
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setBounds(291, 52, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JLabel lblMensSalon = new JLabel("Men's Salon");
		lblMensSalon.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblMensSalon.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensSalon.setBounds(39, 229, 228, 27);
		frame.getContentPane().add(lblMensSalon);
		
		JLabel lblNewLabel_1_2_3 = new JLabel("");
		lblNewLabel_1_2_3.setIcon(new ImageIcon("gym02.jpg"));
		lblNewLabel_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_3.setBounds(304, 255, 228, 150);
		frame.getContentPane().add(lblNewLabel_1_2_3);
		
		JLabel lblFitnessCenter = new JLabel("Fitness Center");
		lblFitnessCenter.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblFitnessCenter.setHorizontalAlignment(SwingConstants.CENTER);
		lblFitnessCenter.setBounds(304, 229, 228, 27);
		frame.getContentPane().add(lblFitnessCenter);
		
		JLabel lblNewLabel_1_2_4 = new JLabel("");
		lblNewLabel_1_2_4.setIcon(new ImageIcon("pastry.jpg"));
		lblNewLabel_1_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_4.setBounds(571, 255, 228, 150);
		frame.getContentPane().add(lblNewLabel_1_2_4);
		
		JLabel lblCafe = new JLabel("Cafe'");
		lblCafe.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblCafe.setHorizontalAlignment(SwingConstants.CENTER);
		lblCafe.setBounds(571, 229, 228, 27);
		frame.getContentPane().add(lblCafe);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("");
		lblNewLabel_1_2_2.setIcon(new ImageIcon("rest.jpg"));
		lblNewLabel_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2.setBounds(543, 52, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_5 = new JLabel("");
		lblNewLabel_1_2_5.setIcon(new ImageIcon("salon03.jpg"));
		lblNewLabel_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_5.setBounds(39, 255, 228, 150);
		frame.getContentPane().add(lblNewLabel_1_2_5);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("");
		lblNewLabel_1_2_2_1.setIcon(new ImageIcon("court.jpg"));
		lblNewLabel_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_1.setBounds(820, 52, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_2_1);
		
		JLabel lblTennisCourt = new JLabel("Tennis court");
		lblTennisCourt.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblTennisCourt.setHorizontalAlignment(SwingConstants.CENTER);
		lblTennisCourt.setBounds(820, 20, 228, 27);
		frame.getContentPane().add(lblTennisCourt);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("");
		lblNewLabel_1_2_2_2.setIcon(new ImageIcon("air.jpg"));
		lblNewLabel_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_2_2.setBounds(820, 474, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pick-up from the airport");
		lblNewLabel_2_1.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(820, 442, 228, 27);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2_6 = new JLabel("");
		lblNewLabel_1_2_6.setIcon(new ImageIcon("parlour.jpg"));
		lblNewLabel_1_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6.setBounds(39, 474, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_6);
		
		JLabel lblLadiesParlour = new JLabel("Ladies parlour");
		lblLadiesParlour.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblLadiesParlour.setHorizontalAlignment(SwingConstants.CENTER);
		lblLadiesParlour.setBounds(39, 442, 228, 27);
		frame.getContentPane().add(lblLadiesParlour);
		
		JLabel lblNewLabel_1_2_6_1 = new JLabel("");
		lblNewLabel_1_2_6_1.setIcon(new ImageIcon("gift02.jpg"));
		lblNewLabel_1_2_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_1.setBounds(304, 474, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_6_1);
		
		JLabel lblGiftShop = new JLabel("Gift shop");
		lblGiftShop.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblGiftShop.setHorizontalAlignment(SwingConstants.CENTER);
		lblGiftShop.setBounds(304, 442, 228, 27);
		frame.getContentPane().add(lblGiftShop);
		
		JLabel lblNewLabel_1_2_6_1_1 = new JLabel("");
		lblNewLabel_1_2_6_1_1.setIcon(new ImageIcon("net02.jpg"));
		lblNewLabel_1_2_6_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_1_1.setBounds(571, 474, 228, 138);
		frame.getContentPane().add(lblNewLabel_1_2_6_1_1);
		
		JLabel lblNewLabel_1_2_6_1_1_1 = new JLabel("");
		lblNewLabel_1_2_6_1_1_1.setIcon(new ImageIcon("drink.jpg"));
		lblNewLabel_1_2_6_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_6_1_1_1.setBounds(820, 255, 228, 150);
		frame.getContentPane().add(lblNewLabel_1_2_6_1_1_1);
		
		JLabel lblHighspeedInternetAcces = new JLabel("HIgh-speed internet access");
		lblHighspeedInternetAcces.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblHighspeedInternetAcces.setHorizontalAlignment(SwingConstants.CENTER);
		lblHighspeedInternetAcces.setBounds(592, 442, 189, 27);
		frame.getContentPane().add(lblHighspeedInternetAcces);
		
		JLabel lblComplimentaryDrinks_1 = new JLabel("Complimentary drinks");
		lblComplimentaryDrinks_1.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblComplimentaryDrinks_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblComplimentaryDrinks_1.setBounds(820, 229, 228, 27);
		frame.getContentPane().add(lblComplimentaryDrinks_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 203, 1069, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 416, 1069, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 630, 1069, 2);
		frame.getContentPane().add(separator_2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
