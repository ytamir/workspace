
import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.io.*;
import java.util.Enumeration;

public class VotingSystemDemo 
{
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JTextField text1;
		private JLabel label;
		private JLabel label1;
		
	
	
	//Where the GUI is created:
	JFrame frame = new JFrame("Voting Menu Demo");
	
	//Where the GUI is created:
	JMenuBar menuBar; //The entire bar
	JMenu menu, submenu; //A single drop-down menu
	JMenuItem menuItem,menuItem1,menuItem2,menuItem3; //A single item in a menu
	JRadioButtonMenuItem rbMenuItem; //radio button menu item
	JCheckBoxMenuItem cbMenuItem; //checkbox menu item
		
	public VotingSystemDemo()
	{
		//create menu function call
		
		panel = new JPanel();
		button = new JButton("Enter User");
		text = new JTextField(3);//3 cols, not 20 chars
		text1 = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Please Enter Your First Name");
		label1 = new JLabel("Please Enter Your Last Name");
		
		
		
		//Load the listener
		button.addActionListener(buttonListener());	
		
		//load the panel
		panel.add(label);
		panel.add(text);
		panel.add(label1);
		panel.add(text1);
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
				String input1 = text.getText();
				String input2 = text1.getText();
				String filename = input2 + "_" + input1 + "_ballot.txt";
				if (readinfile(filename))
				{
					JOptionPane.showMessageDialog(null, "You Have Already voted, Patriot, please exercise DEMOCRACY AND ONLY VOTE ONCE");
				}
				else
				{

					//JOptionPane.showMessageDialog(null, "Please Select your candidate on the next page from the menu and vote");
					createMenu();
					menuItem.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e2)
						{
							//System.out.println("here3");
							
								try {
									 File file = new File("src\\" +filename);
									
								      // creates the file
								      file.createNewFile();
								      
								      // creates a FileWriter Object
								      FileWriter writer = new FileWriter(file); 
								      
								      // Writes the content to the file
								      writer.write(input2 +","+input1+","+"LebronJames"); 
								      
								      writer.flush();
								      
								      writer.close();
								    
								     
									frame.setVisible(false);
									
								} catch (IOException  e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						}
					});
					
					menuItem1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e2)
						{
							//System.out.println("here7");
							try {
								 File file = new File("src\\" +filename);
								
							      // creates the file
							      file.createNewFile();
							      
							      // creates a FileWriter Object
							      FileWriter writer = new FileWriter(file); 
							      
							      // Writes the content to the file
							      writer.write(input2 +","+input1+","+"BillyMayz"); 
							      
							      writer.flush();
							      
							      writer.close();
							    
							     
								frame.setVisible(false);
								
							} catch (IOException  e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					
					});
					menuItem2.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e2)
						{
							//System.out.println("here5");
							try {
								 File file = new File("src\\" +filename);
								
							      // creates the file
							      file.createNewFile();
							      
							      // creates a FileWriter Object
							      FileWriter writer = new FileWriter(file); 
							      
							      // Writes the content to the file
							      writer.write(input2 +","+input1+","+"AaronBurr"); 
							      
							      writer.flush();
							      
							      writer.close();
							    
							     
								frame.setVisible(false);
								
							} catch (IOException  e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					
					});
					menuItem3.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e2)
						{
							System.out.println("here6");
							try {
								 File file = new File("src\\" +filename);
								
							      // creates the file
							      file.createNewFile();
							      
							      // creates a FileWriter Object
							      FileWriter writer = new FileWriter(file); 
							      
							      // Writes the content to the file
							      writer.write(input2 +","+input1+","+"Tupac"); 
							      
							      writer.flush();
							      
							      writer.close();
							    
							     
								frame.setVisible(false);
								
							} catch (IOException  e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					
					});
				}
				
				label.setText(filename);
				System.out.println(filename);
			}
		};
		
		return listener;
	}
	
	public boolean readinfile( String filename)
	{
		BufferedReader br = null;
		String line;
		try{
			br = new BufferedReader(new FileReader("src\\" +filename));
			while ((line = br.readLine()) != null)
			{
				System.out.println(line);
			}
			return true;
		}
		catch(IOException e1) 
		{
		 e1.printStackTrace();
			
		
		}
		
		return false;
	}
	
	
	public void createMenu()
	{
		
	
		
	/*	JMenuBar menuBar = null; //The entire bar
		JMenu menu; //A single drop-down menu
		JMenuItem menuItem; //A single item in a menu
		JRadioButtonMenuItem rbMenuItem; //radio button menu item*/
		menuBar = new JMenuBar();

		//Build the first menu.
		menu = new JMenu("Voting Menu");
		menu.setMnemonic(KeyEvent.VK_A); //Allows for hotkey access, Alt+a
		menuBar.add(menu); //Add to menu bar

		//Create the menu bar.
		System.out.println("here4");
		
		
		//Build the first menu.
		
		menuItem = new JMenuItem("Click Here to vote for Lebron James");
		menu.add(menuItem);

		//a group of radio button menu items
		menu.addSeparator();
		
		menuItem1 = new JMenuItem("Click Here to vote for Billy Mayz");
		menu.add(menuItem1);

		//a group of radio button menu items
		menu.addSeparator();
		
		menuItem2 = new JMenuItem("Click Here to vote for Aaron Burr");
		menu.add(menuItem2);

		//a group of radio button menu items
		menu.addSeparator();
		
		menuItem3 = new JMenuItem("Click Here to vote for Tupac");
		menu.add(menuItem3);

		//a group of radio button menu items
		menu.addSeparator();
		
		
		

			
		
		//a group of check box menu items
		

		frame.setJMenuBar(menuBar);
		
		frame.pack();
		frame.setVisible(true);
		
		
	
		
		
		
		}
	}
