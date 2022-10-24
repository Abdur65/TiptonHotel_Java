package bookingWin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sample extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample frame = new Sample();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sample() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0x87CEEB));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setFont(new Font("Sitka Small", Font.BOLD, 16));
		lblReceipt.setBounds(185, 11, 399, 27);
		contentPane.add(lblReceipt);
		
		JLabel nlbl = new JLabel("N");
		nlbl.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		nlbl.setBounds(55, 42, 633, 27);
		contentPane.add(nlbl);
		
		JLabel lblP = new JLabel("P");
		lblP.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblP.setBounds(55, 80, 633, 27);
		contentPane.add(lblP);
		
		JLabel lblE = new JLabel("E");
		lblE.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblE.setBounds(55, 119, 633, 27);
		contentPane.add(lblE);
		
		JLabel lblS = new JLabel("S");
		lblS.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblS.setBounds(55, 156, 633, 27);
		contentPane.add(lblS);
		
		JLabel lblEn = new JLabel("En");
		lblEn.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblEn.setBounds(55, 194, 633, 27);
		contentPane.add(lblEn);
		
		JLabel lblD = new JLabel("D");
		lblD.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblD.setBounds(55, 232, 633, 27);
		contentPane.add(lblD);
		
		JLabel lblSu = new JLabel("Su");
		lblSu.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblSu.setBounds(55, 270, 633, 27);
		contentPane.add(lblSu);
		
		JLabel lblT = new JLabel("Total cost - $");
		lblT.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblT.setBounds(55, 308, 633, 27);
		contentPane.add(lblT);
		
		JLabel lblA = new JLabel("Advance payment - $");
		lblA.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		lblA.setBounds(55, 346, 633, 27);
		contentPane.add(lblA);
		
		JLabel lblDoYouWish = new JLabel("Do you wish to confirm your booking?");
		lblDoYouWish.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWish.setFont(new Font("Palatino Linotype", Font.ITALIC, 14));
		lblDoYouWish.setBounds(67, 412, 633, 27);
		contentPane.add(lblDoYouWish);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Congratulations your booking has been confirmed!\nWe look forward to meeting"
						+ " you.");
			}
		});
		btnYes.setBackground(new Color(0x000E80));
		btnYes.setForeground(Color.white);
		btnYes.setBounds(109, 434, 120, 41);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNo.setBackground(new Color(0x000E80));
		btnNo.setForeground(Color.white);
		btnNo.setBounds(532, 434, 120, 41);
		contentPane.add(btnNo);
	}

}
