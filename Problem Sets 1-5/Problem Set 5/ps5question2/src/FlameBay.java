import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;



public class FlameBay extends JFrame
{
	private String name1, name2, name3, name4, name5, name6, name7, name8, name9;
	private double price1, price2, price3, price4, price5, price6, price7, price8, price9, total;
	public int counter1, counter2, counter3, counter4, counter5, counter6, counter7, counter8, counter9;
	
	private JTextArea console = new JTextArea();
	
	private JPanel  south_region = new JPanel();
	private JPanel  north_region = new JPanel();
	private JPanel  center_region = new JPanel();
	
	private JButton button1 = new JButton("Clear");
	private JButton button2 = new JButton("Check Out");
	
	public JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private ImageIcon icon1, icon2, icon3, icon4, icon5, icon6, icon7, icon8, icon9;
	
	public void Reset()
	{
		counter1 = 0;
		counter2 = 0;
		counter3 = 0;
		counter4 = 0;
		counter5 = 0;
		counter6 = 0;
		counter7 = 0;
		counter8 = 0;
		counter9 = 0;
		
		console.append(" ============= Flame Bay ============= \n");
		console.append("\n");
	}
	
	public FlameBay()
	{	
		name1 = "Egg Noodles";
		name2 = "Spagetti";
		name3 = "Ramen";
		name4 = "Beef";
		name5 = "Chicken";
		name6 = "Pork";
		name7 = "Kung Pao";
		name8 = "Teriyaki";
		name9 = "Curry";
		
		price1 = 1.00;
		price2 = 0.95;
		price3 = 0.50;
		price4 = 2.00;
		price5 = 1.50;
		price6 = 1.25;
		price7 = 0.50;
		price8 = 0.25;
		price9 = 0.40;
		total = 0.00;
		
		//Northern region------------------------------------------------------
		LayoutManager panel_layout1 = new BorderLayout();
		north_region.setLayout(panel_layout1);
		
		north_region.add(button1);
		
		add(north_region, BorderLayout.NORTH);
		
		//Center region--------------------------------------------------------
		
		LayoutManager panel_layout2 = new GridLayout(3, 3);
		center_region.setLayout(panel_layout2);
		
		icon1 = new ImageIcon("egg noodles icon.jpg");
		icon2 = new ImageIcon("spaghetti icon.jpg");
		icon3 = new ImageIcon("ramen icon.jpg");
		icon4 = new ImageIcon("beef icon.png");
		icon5 = new ImageIcon("chicken icon.jpg");
		icon6 = new ImageIcon("pork icon.jpg");
		icon7 = new ImageIcon("kung pao icon.jpg");
		icon8 = new ImageIcon("teriyaki icon.jpg");
		icon9 = new ImageIcon("curry icon.jpg");
		
		b1 = new JButton(icon1);
		b2 = new JButton(icon2);
		b3 = new JButton(icon3);
		b4 = new JButton(icon4);
		b5 = new JButton(icon5);
		b6 = new JButton(icon6);
		b7 = new JButton(icon7);
		b8 = new JButton(icon8);
		b9 = new JButton(icon9);
		
		center_region.add(b1);
		center_region.add(b2);
		center_region.add(b3);
		center_region.add(b4);
		center_region.add(b5);
		center_region.add(b6);
		center_region.add(b7);
		center_region.add(b8);
		center_region.add(b9);
		
		add(console, BorderLayout.EAST);
		add(center_region, BorderLayout.CENTER);
		
		console.append(" ============= Flame Bay ============= \n");
		console.append("\n");
		
		//Southern region-------------------------------------------------------
		LayoutManager panel_layout3 = new BorderLayout();
		south_region.setLayout(panel_layout3);
		
		south_region.add(button2);
		
		add(south_region, BorderLayout.SOUTH);
		
		//------------------------------------------------------------------------------------------
		
		Callback run = new Callback();
		button1.addActionListener(run);
		button2.addActionListener(run);
		b1.addActionListener(run);
		b2.addActionListener(run);
		b3.addActionListener(run);
		b4.addActionListener(run);
		b5.addActionListener(run);
		b6.addActionListener(run);
		b7.addActionListener(run);
		b8.addActionListener(run);
		b9.addActionListener(run);
		
		setTitle("Flame Bay");
		setSize(650, 415);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public class Callback implements ActionListener
	{
		public void actionPerformed(ActionEvent what_happened) 
		{
			if(what_happened.getSource() == button1)
			{
				console.setText(null);
				Reset();
			}
			if(what_happened.getSource() == button2)
			{
				total = counter1 * price1 + counter2 * price2 + counter3 * price3 + counter4 * price4 +
						counter5 * price5 + counter6 * price6 + counter7 * price7 + counter8 * price8 +
						counter9 * price9;
				
				DecimalFormat df = new DecimalFormat("0.00");
				String result = "--- Cost: $" + df.format(total) + "\n";
				console.append(result);
			}
			if(what_happened.getSource() == b1)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name1 + " $" + df.format(price1) + "\n";
				console.append(result);
				
				counter1++;
			}
			if(what_happened.getSource() == b2)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name2 + " $" + df.format(price2) + "\n";
				console.append(result);
				
				counter2++;
			}
			if(what_happened.getSource() == b3)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name3 + " $" + df.format(price3) + "\n";
				console.append(result);
				
				counter3++;
			}
			if(what_happened.getSource() == b4)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name4 + " $" + df.format(price4) + "\n";
				console.append(result);
				
				counter4++;
			}
			if(what_happened.getSource() == b5)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name5 + " $" + df.format(price5) + "\n";
				console.append(result);
				
				counter5++;
			}
			if(what_happened.getSource() == b6)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name6 + " $" + df.format(price6) + "\n";
				console.append(result);
				
				counter6++;
			}
			if(what_happened.getSource() == b7)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name7 + " $" + df.format(price7) + "\n";
				console.append(result);
				
				counter7++;
			}
			if(what_happened.getSource() == b8)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name8 + " $" + df.format(price8) + "\n";
				console.append(result);
				
				counter8++;
			}
			if(what_happened.getSource() == b9)
			{
				DecimalFormat df = new DecimalFormat("0.00");
				String result = name9 + " $" + df.format(price9) + "\n";
				console.append(result);
				
				counter9++;
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		FlameBay test = new FlameBay();
	}
	
}
