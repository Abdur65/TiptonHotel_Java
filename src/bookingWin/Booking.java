package bookingWin;

import java.util.Random;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Booking extends JFrame {

	private JPanel contentPane, contentPane2;
	private JTextField nfld;
	private JTextField pfld;
	private JTextField efld;
	private JTextField sdatefld;
	private JTextField edatefld;
	private JTextField spfld;
	private JLabel nlbl, lblP, lblE, lblS, lblD, lblSu, lblT, lblEn, lblA, lblDoYouWish, lblReceipt;
	private JButton btnYes, btnNo, submit;
	private DateTimeFormatter dtf;
	private Period per;
	private String start_date, end_date, name, phone_no, email, suite;
	private JComboBox comboBox;
    private int tcost, acost, stay_day;
    private Random ran;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking frame = new Booking();
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
	public Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 539);
		fill_out();		
	}
	
	void fill_out()
	{
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(0x87CEEB));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/d");
		
		JLabel lblNewLabel = new JLabel("Please fill out the following information");
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 11, 399, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(50, 63, 109, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Phone number: ");
		lblNewLabel_1_1.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(50, 101, 109, 27);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Email:");
		lblNewLabel_1_2.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(50, 138, 109, 27);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Suite:");
		lblNewLabel_1_3.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(50, 176, 109, 27);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("When will you start staying?(YYYY/MM/D)");
		lblNewLabel_1_4.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_1_4.setBounds(50, 215, 311, 27);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("When do you plan to departure?(YYYY/MM/D)");
		lblNewLabel_1_5.setFont(new Font("Sitka Small", Font.PLAIN, 13));
		lblNewLabel_1_5.setBounds(50, 253, 332, 27);
		contentPane.add(lblNewLabel_1_5);
		
		nfld = new JTextField();
		nfld.setBounds(429, 64, 246, 20);
		contentPane.add(nfld);
		nfld.setColumns(10);
		
		pfld = new JTextField();
		pfld.setColumns(10);
		pfld.setBounds(429, 102, 246, 20);
		contentPane.add(pfld);
		
		efld = new JTextField();
		efld.setColumns(10);
		efld.setBounds(429, 139, 246, 20);
		contentPane.add(efld);
		
		/*
		 * Occupancy change.
		 */
		comboBox = new JComboBox();
		ran = new Random();
		int i = ran.nextInt(6);
		
		if(i == 0)
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Presidential", "Royal", "Executive", "Delux", "Family"}));
		}
		else if(i == 1)
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Presidential", "Executive", "Delux", "Family"}));
		}
		else if(i == 2)
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Presidential", "Royal", "Executive", "Family"}));
		}
		else if(i == 3)
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Presidential", "Royal", "Executive", "Delux"}));
		}
		else if(i == 4)
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Royal", "Executive", "Delux", "Family"}));
		}
		else if(i == 5)
		{
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Presidential", "Royal", "Delux", "Family"}));
		}
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(429, 176, 246, 22);
		comboBox.setBackground(Color.white);
		contentPane.add(comboBox);
		suite = (String) comboBox.getSelectedItem();
		
		sdatefld = new JTextField();
		sdatefld.setColumns(10);
		sdatefld.setBounds(429, 216, 246, 20);
		contentPane.add(sdatefld);
		
		edatefld = new JTextField();
		edatefld.setColumns(10);
		edatefld.setBounds(429, 254, 246, 20);
		contentPane.add(edatefld);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("<HTML>*Note: If you don't see some of the suites in the option, it is because they are unavailable for"
				+ " booking.</HTML>");
		lblNewLabel_1_5_1.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_1_5_1.setBounds(50, 303, 550, 30);
		contentPane.add(lblNewLabel_1_5_1);
		
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start_date = sdatefld.getText();
				end_date = edatefld.getText();
				email = efld.getText();
				name = nfld.getText();
				phone_no = pfld.getText();
				LocalDate stdate = LocalDate.parse(start_date, dtf);
				LocalDate eddate = LocalDate.parse(end_date, dtf);
				per = Period.between(stdate, eddate);
				stay_day = per.getDays();
				costing();
				receipt();
			}
		});
		submit.setForeground(Color.white);
		submit.setBackground(new Color(0x000E80));
		submit.setBounds(292, 431, 149, 41);
		contentPane.add(submit);
		setVisible(true);
	}
	
	void costing()
	{
		if(suite == "Presidential")
		{
			tcost = stay_day*940;
		}
		else if(suite.equals("Royal"))
		{
			tcost = stay_day*470;		
			
		}
		else if(suite.equals("Family"))
		{
			tcost = (stay_day)*210;		
			
		}
		else if(suite.equals("Executive"))
		{
			tcost = stay_day*170;
			
		}
		else if(suite.equals("Delux"))
		{
			tcost = stay_day*150;	
			
		}
	}
	
	void receipt()
	{
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane2.setBackground(new Color(0x87CEEB));
		setContentPane(contentPane2);
		contentPane2.setLayout(null);
		
		lblReceipt = new JLabel("Receipt");
		lblReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblReceipt.setFont(new Font("Sitka Small", Font.BOLD, 17));
		lblReceipt.setBounds(185, 11, 399, 27);
		contentPane2.add(lblReceipt);
		
		nlbl = new JLabel();
		nlbl.setText("Name - "+name);
		nlbl.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		nlbl.setBounds(55, 42, 633, 27);
		contentPane2.add(nlbl);
		
		lblP = new JLabel();
		lblP.setText("Phone number - "+phone_no);
		lblP.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblP.setBounds(55, 80, 633, 27);
		contentPane2.add(lblP);
		
		lblE = new JLabel();
		lblE.setText("Email - "+email);
		lblE.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblE.setBounds(55, 119, 633, 27);
		contentPane2.add(lblE);
		
		lblS = new JLabel("Start of stay - "+start_date);
		lblS.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblS.setBounds(55, 156, 633, 27);
		contentPane2.add(lblS);
		
		lblEn = new JLabel("Departure date - "+end_date);
		lblEn.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblEn.setBounds(55, 194, 633, 27);
		contentPane2.add(lblEn);
		
		lblD = new JLabel("Duration of stay - "+per.getDays()+" nights");
		lblD.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblD.setBounds(55, 232, 633, 27);
		contentPane2.add(lblD);
		
		lblSu = new JLabel("Suite - "+suite);
		lblSu.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblSu.setBounds(55, 270, 633, 27);
		contentPane2.add(lblSu);
		
		lblT = new JLabel("Total cost - $"+tcost);
		lblT.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblT.setBounds(55, 308, 633, 27);
		contentPane2.add(lblT);
		
		lblA = new JLabel("Advance payment - $"+(0.4*tcost));
		lblA.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		lblA.setBounds(55, 346, 633, 27);
		contentPane2.add(lblA);
		
		lblDoYouWish = new JLabel("Do you wish to confirm your booking?");
		lblDoYouWish.setHorizontalAlignment(SwingConstants.CENTER);
		lblDoYouWish.setFont(new Font("Palatino Linotype", Font.ITALIC, 14));
		lblDoYouWish.setBounds(67, 412, 633, 27);
		contentPane2.add(lblDoYouWish);
		
		
		
		btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				create_receipt();
				JOptionPane.showMessageDialog(null, "Congratulations your booking has been confirmed!\nWe look forward to meeting"
						+ " you.");
			}
		});
		btnYes.setBackground(new Color(0x000E80));
		btnYes.setForeground(Color.white);
		btnYes.setBounds(109, 434, 120, 41);
		contentPane2.add(btnYes);
		
		btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(lblReceipt);
				remove(nlbl);
				remove(lblP);
				remove(lblT);
				remove(lblEn);
				remove(lblD);
				remove(lblSu);
				remove(lblE);
				remove(btnYes);
				remove(btnNo);
				remove(lblDoYouWish);
				setVisible(false);
				fill_out();
			}
		});
		btnNo.setBackground(new Color(0x000E80));
		btnNo.setForeground(Color.white);
		btnNo.setBounds(532, 434, 120, 41);
		contentPane2.add(btnNo);
		setVisible(true);
		
	}
	
	void create_receipt()
	{
		File fi = new File("receipt.txt");
		try {
			
			FileWriter writer = new FileWriter(fi, true);
			BufferedWriter bwriter = new BufferedWriter(writer);
			bwriter.append(nlbl.getText()+"\n");
			bwriter.append(lblP.getText()+"\n");
			bwriter.append(lblE.getText()+"\n");
			bwriter.append(lblS.getText()+"\n");
			bwriter.append(lblEn.getText()+"\n");
			bwriter.append(lblD.getText()+"\n");
			bwriter.append(lblSu.getText()+"\n");
			bwriter.append(lblT.getText()+"\n");
			bwriter.append(lblA.getText()+"\n");
			bwriter.append("\n");
			bwriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
