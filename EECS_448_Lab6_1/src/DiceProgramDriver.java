import javax.swing.JFrame;

public class DiceProgramDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Dice Demo!");
		DiceProgram demo = new DiceProgram();
		
		frame.add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}