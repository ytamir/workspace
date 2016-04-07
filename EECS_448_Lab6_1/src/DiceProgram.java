
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.lang.Math;

public class DiceProgram 
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public DiceProgram()
	{
		panel = new JPanel();
		button = new JButton("Roll The DICE");
		//text = new JTextField(1);//3 cols, not 20 chars
		label = new JLabel();
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		//panel.add(text);
		panel.add(label);
		panel.add(button);
		
	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//String input = text.getText();
				int die1 = (int)(Math.random()*6) + 1;
				String newText = String.valueOf(die1);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}