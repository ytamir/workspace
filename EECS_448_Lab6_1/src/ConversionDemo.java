
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public  class ConversionDemo extends InputVerifier
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public ConversionDemo()
	{
		panel = new JPanel();
		button = new JButton("Convert");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Enter a temperature from F to C");
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(text);
		panel.add(button);
		panel.add(label);
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
				//
				String input = text.getText();
				//JOptionPane.showMessageDialog(null, input);
				//label.setText(input);
				if ( input.equals(""))
				{
					String newText = "TEXTBOX EMPTY";
					label.setText(newText);
					//label.setText("Please do not leave the Textbox EMPTY");
					JOptionPane.showMessageDialog(null, "Textbox is EMPTY, PLEASE ENTER A NUMBER");
					
					
				}
				else
				{
					if(verify(text))
					{
						double tempIn = Double.parseDouble(input);//convert String to double
						double FtoC = (tempIn-32)*(5.0/9.0); //convert F to C
						double FtoK = (tempIn-32)*(5.0/9.0)-273.15; //convert F to K
						double CtoK = tempIn-273.15; //convert C to K
						double CtoF = (((tempIn)*1.8)+32); //convert C to F
						double KtoF = (((tempIn+273.15)*1.8)+32); //convert K to F
						double KtoC = tempIn+273.15; //convert K to C
						
						JOptionPane.showMessageDialog(null, "F to C: " + String.format("%.2f",FtoC));
						JOptionPane.showMessageDialog(null, "F to K: " + String.format("%.2f",FtoK));
						JOptionPane.showMessageDialog(null, "C to K: " + String.format("%.2f",CtoK));
						JOptionPane.showMessageDialog(null, "C to F: " + String.format("%.2f",CtoF));
						JOptionPane.showMessageDialog(null, "K to F: " + String.format("%.2f",KtoF));
						JOptionPane.showMessageDialog(null, "K to C: " + String.format("%.2f",KtoC));
						
						
						//label.setText(newText);
						
						
					}
					else
					{
						String newText = "Not Number";
						label.setText(newText);
						//label.setText("Please do not leave the Textbox EMPTY");
						JOptionPane.showMessageDialog(null, "NOT A NUMBER PLEASE GIVE ME A NUMBER");
					}
				
				
					
					
					/*
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				label.setText(newText);
				System.out.println(newText);*/
				}
			}	
		};
		
		return listener;
	}

	
	public boolean verify(JComponent arg0) {
		// TODO Auto-generated method stub
	       try {
	          Integer.parseInt(((JTextField) arg0).getText());
	       } catch (NumberFormatException e) {
	          return false;
	       }

	       return true;
	   
	}	
}