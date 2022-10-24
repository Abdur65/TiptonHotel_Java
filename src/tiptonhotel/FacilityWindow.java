package tiptonhotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FacilityWindow extends JFrame implements ActionListener{
	
	JButton bill, pool, spa, gift, salon, gym, court, rest, bak, air, net, drink;
	ImageIcon bi, po, sp, gi, sa, gy, bi2, logo, icourt, irest, ibak, iair, inet, idrink;
	
	FacilityWindow()
	{
		Font font = new Font("Calibri Body",Font.BOLD, 17);
		logo = new ImageIcon("logo.jpg");
		
		bill = new JButton("Billiards");
		pool = new JButton("Swimming pool");
		spa = new JButton("Ladies Parlour");
		gift = new JButton("Gift shop");
		gym = new JButton("Fitness center");
		salon = new JButton("Men's Salon");
		court = new JButton("Tennis court");
		rest = new JButton("Multi-Cuisine Restuarant");
		bak = new JButton("Cafe'");
		net = new JButton("<HTML>High-speed internet access</HTML>");
		drink = new JButton("Complimentary drinks");
		air = new JButton("Pick up from airport");
		
		bill.setFocusable(false);
		pool.setFocusable(false);
		spa.setFocusable(false);
		gift.setFocusable(false);
		gym.setFocusable(false);
		salon.setFocusable(false);
		court.setFocusable(false);
		rest.setFocusable(false);
		bak.setFocusable(false);
		net.setFocusable(false);
		drink.setFocusable(false);
		air.setFocusable(false);
		
		bi = new ImageIcon("bill.jpg");
		po = new ImageIcon("pool.jpeg");
		sp = new ImageIcon("parlour.jpg");
		gi = new ImageIcon("gift.jpg");
		sa = new ImageIcon("salon.jpg");
		gy = new ImageIcon("gym.jpeg");
		bi2 = new ImageIcon("bill2.jpg");
		icourt = new ImageIcon("court.jpg");
		irest = new ImageIcon("rest.jpg");
		ibak = new ImageIcon("pastry.jpg");
		inet = new ImageIcon("net.jpg");
		idrink = new ImageIcon("drink.jpg");
		iair = new ImageIcon("air.jpg");
						
		bill.setIcon(bi2);
		bill.setHorizontalTextPosition(JButton.CENTER);
		bill.setFont(font);
		bill.setForeground(new Color(0xF50F00  ));
		pool.setIcon(po);
		pool.setHorizontalTextPosition(JButton.CENTER);
		pool.setFont(font);
		pool.setForeground(new Color(0xF50F00  ));
		spa.setIcon(sp);
		spa.setHorizontalTextPosition(JButton.CENTER);
		spa.setFont(font);
		spa.setForeground(new Color(0xF50F00 ));
		gift.setIcon(gi);
		gift.setHorizontalTextPosition(JButton.CENTER);
		gift.setFont(font);
		gift.setForeground(new Color(0xF50F00));
		gym.setIcon(gy);
		gym.setHorizontalTextPosition(JButton.CENTER);
		gym.setFont(font);
		gym.setForeground(new Color(0xF50F00));
		salon.setIcon(sa);
		salon.setHorizontalTextPosition(JButton.CENTER);
		salon.setFont(font);
		salon.setForeground(new Color(0xF50F00));
		court.setIcon(icourt);
		court.setHorizontalTextPosition(JButton.CENTER);
		court.setFont(font);
		court.setForeground(new Color(0xF50F00  ));
		air.setIcon(iair);
		air.setFont(font);
		air.setForeground(new Color(0xF50F00));
		air.setHorizontalTextPosition(JButton.CENTER);
		rest.setIcon(irest);
		rest.setFont(font);
		rest.setForeground(new Color(0xF50F00));
		rest.setHorizontalTextPosition(JButton.CENTER);
		bak.setIcon(ibak);
		bak.setFont(font);
		bak.setForeground(new Color(0xF50F00));
		bak.setHorizontalTextPosition(JButton.CENTER);
		net.setIcon(inet);
		net.setFont(font);
		net.setHorizontalTextPosition(JButton.CENTER);
		net.setForeground(new Color(0xF50F00));
		drink.setIcon(idrink);
		drink.setFont(font);
		drink.setHorizontalTextPosition(JButton.CENTER);
		drink.setForeground(new Color(0xF50F00));
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 500);
		this.setLayout(new GridLayout(3,3));
		this.setResizable(false);
		this.setTitle("Facilities");
		this.setIconImage(logo.getImage());
		this.add(bill);
		this.add(pool);
		this.add(spa);
		this.add(gift);
		this.add(salon);
		this.add(gym);
		this.add(air);
		this.add(bak);
		this.add(court);
		this.add(drink);
		this.add(net);
		this.add(rest);
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
