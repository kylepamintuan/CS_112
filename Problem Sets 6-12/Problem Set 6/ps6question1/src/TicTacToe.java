import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TicTacToe extends JFrame
{
	private JMenuBar bar = new JMenuBar();
	private JMenu file = new JMenu("File");
	private JMenuItem exit = new JMenuItem("Exit");
	private JPanel center_region = new JPanel();
	private boolean is_X = false;
	private int counter = 0;
	
	JButton[] b = new JButton[9];
	String[] array = new String[9];
	
	public TicTacToe()
	{
		//add buttons to JButton array
		for (int x = 0; x < 9; x++)
		{
			b[x] = new JButton(" ");
		}
		
		//add button text to string array
		for (int x = 0; x < 9; x++)
		{
			array[x] = b[x].getText();
		}
		
		//callbacks for when buttons are pressed
		Callback run = new Callback();
		for (int x = 0; x < 9; x++)
		{
			b[x].addActionListener(run);
		}
		
		//Northern Region---------------------------------------------------------------------------------------
		bar.add(file);
		file.add(exit);
		add(bar, BorderLayout.NORTH);
		
		ExitCallback ec = new ExitCallback();
		exit.addActionListener(ec);
		
		//Center Region-----------------------------------------------------------------------------------------
		
		LayoutManager panel_layout2 = new GridLayout(3, 3);
		center_region.setLayout(panel_layout2);
		
		for (int x = 0; x < 9; x++)
		{
			center_region.add(b[x]);
		}
		
		add(center_region, BorderLayout.CENTER);
		
		//-----------------------------------------------------------------------------------------------------
		
		setTitle("Tic Tac Toe (ps6)");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//-----------------------------------------------------------------------------------------------------
		
		
	}
	
	public void Reset()
	{
		for (int x = 0; x < 9; x++)
		{
			b[x].setText(" ");
			array[x] = " ";
		}
		
		is_X = false;
		counter = 0;
	}
	
	public class Callback implements ActionListener
	{
		public void actionPerformed(ActionEvent what_happened) 
		{	
			for (int x = 0; x < 9; x++)
			{
				if(what_happened.getSource() == b[x])
				{
					if (array[x] == " ")
					{
						if (counter == 0)
						{
							b[x].setText("X");
							array[x] = "X";
							counter++;
							
							is_X = true;
						}
						else if (counter != 0 && is_X == false)
						{
							b[x].setText("X");
							array[x] = "X";
							is_X = true;
						}
						else if (counter != 0 && is_X == true)
						{
							b[x].setText("O");
							array[x] = "O";
							is_X = false;
						}
					}
				}
			}
			
			//Combinations to win for "X"
			if (array[0] == "X" && array[1] == "X" & array[2] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[3] == "X" && array[4] == "X" & array[5] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[6] == "X" && array[7] == "X" & array[8] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[0] == "X" && array[3] == "X" & array[6] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[1] == "X" && array[4] == "X" & array[7] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[2] == "X" && array[5] == "X" & array[8] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[0] == "X" && array[4] == "X" & array[8] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			if (array[2] == "X" && array[4] == "X" & array[6] == "X")
			{
				JOptionPane.showMessageDialog(null, "Winner: X");
				Reset();
			}
			
			//Combinations to win for "O"
			if (array[0] == "O" && array[1] == "O" & array[2] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[3] == "O" && array[4] == "O" & array[5] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[6] == "O" && array[7] == "O" & array[8] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[0] == "O" && array[3] == "O" & array[6] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[1] == "O" && array[4] == "O" & array[7] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[2] == "O" && array[5] == "O" & array[8] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[0] == "O" && array[4] == "O" & array[8] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
			if (array[2] == "O" && array[4] == "O" & array[6] == "O")
			{
				JOptionPane.showMessageDialog(null, "Winner: O");
				Reset();
			}
		}
	}
	
	
	public class ExitCallback implements ActionListener
	{
		public void actionPerformed(ActionEvent what_happened) 
		{
			System.exit(0);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		TicTacToe test = new TicTacToe();
	}
}
