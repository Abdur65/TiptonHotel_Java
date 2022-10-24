package bookingWin;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class BookInfo extends JFrame {

	private JPanel contentPane, contentPane2;
	private JLabel head, name, num, suite, nights;
	private JTextField numfld, namefld;
	private JComboBox comboBox;
	private JSpinner spinner;
	private JButton submit;
	private String pn;
	private String nm;
	private String st;
	private int i, cost;
	private SimpleDateFormat timeForm, dateForm;
	private String date, time;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookInfo frame = new BookInfo();
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
	public BookInfo() {
		ImageIcon logo = new ImageIcon("logo.jpg");
		this.setIconImage(logo.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 502);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.CYAN);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		personal_info();
		
		
	}
	
	void personal_info()
	{
		head = new JLabel("Please fill out the following information.");
		head.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		head.setHorizontalAlignment(SwingConstants.CENTER);
		head.setBounds(154, 11, 322, 27);
		contentPane.add(head);
		
		name = new JLabel("Name");
		name.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		name.setBounds(38, 58, 136, 27);
		contentPane.add(name);
		
	    namefld = new JTextField();
		namefld.setBounds(203, 55, 262, 27);
		contentPane.add(namefld);
		namefld.setColumns(10);
		
		num = new JLabel("Phone No.");
		num.setVerticalAlignment(SwingConstants.BOTTOM);
		num.setHorizontalAlignment(SwingConstants.LEFT);
		num.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		num.setBounds(38, 96, 136, 27);
		contentPane.add(num);
		
		numfld = new JTextField();
		numfld.setBounds(203, 93, 262, 27);
		contentPane.add(numfld);
		numfld.setColumns(10);
		
		suite = new JLabel("Suite");
		suite.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		suite.setBounds(38, 145, 46, 27);
		contentPane.add(suite);
		
		comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Palatino Linotype", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Presidential", "Royal", "Executive", "Family", "Delux"}));
		comboBox.setSelectedIndex(0);
		comboBox.setToolTipText("");
		comboBox.setBounds(203, 147, 262, 25);
		contentPane.add(comboBox);
		
		nights = new JLabel("No. of nights");
		nights.setFont(new Font("Palatino Linotype", Font.PLAIN, 17));
		nights.setBounds(38, 201, 112, 27);
		contentPane.add(nights);
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(Integer.valueOf(1), null, null, Integer.valueOf(1)));
		spinner.setFont(new Font("Palatino Linotype", Font.PLAIN, 14));
		spinner.setBounds(203, 201, 96, 27);
		contentPane.add(spinner);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(38, 264, 523, 2);
		contentPane.add(separator);
		
		submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				submission();
			}
		});
		submit.setVerticalAlignment(SwingConstants.BOTTOM);
		submit.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		submit.setBounds(215, 290, 155, 37);
		submit.setFocusable(false);
		contentPane.add(submit);
		
	}
	
	void submission()
	{
		nm = namefld.getText();
		st = (String) comboBox.getSelectedItem();
		i = (int) spinner.getValue();
		pn = numfld.getText();
		contentPane2 = new JPanel();
		contentPane2.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane2.setBackground(Color.CYAN);
		setContentPane(contentPane2);
		if(st == "Presidential")
		{
			cost = i*940;
		}
		else if(st.equals("Royal"))
		{
			cost = i*470;		
			
		}
		else if(st.equals("Family"))
		{
			cost = i*210;		
			
		}
		else if(st.equals("Executive"))
		{
			cost = i*170;
			
		}
		else if(st.equals("Delux"))
		{
			cost = i*150;	
			
		}
		
		dateForm = new SimpleDateFormat("MMMMM dd, yyyy");
		timeForm = new SimpleDateFormat("hh:mm:ss a");
		date = dateForm.format(Calendar.getInstance().getTime());
		time = timeForm.format(Calendar.getInstance().getTime());
		
		JLabel lblNewLabel = new JLabel("<HTML>Name:   "+ nm+"<br>Phone Number:   "+pn+"<br>Booking time:   "+time+", "+date
				+"<br>Duration of stay: "+i+"<br>Total payment:   "+cost+"<br>Advance payment:   "+(0.4*cost)+"<br><br></HTML>");
		lblNewLabel.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(41, 32, 540, 254);
		contentPane2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Do you want confirm your booking?");
		lblNewLabel_1.setFont(new Font("Sitka Small", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(164, 330, 288, 34);
		contentPane2.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Yes");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, nm+", your booking has been confirmed.\n"
						+ "We hope you will enjoy your stay. Thank you for choosing Tipton!");
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 51, 102));
		btnNewButton.setBounds(118, 375, 104, 39);
		contentPane2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personal_info();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 51, 102));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(411, 375, 104, 39);
		contentPane2.add(btnNewButton_1);
		
		setVisible(true);
		
	}
	 

}
