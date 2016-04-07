import javax.swing.JFrame;

public class ConversionDemoDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Conversion Demo!");
		ConversionDemo demo = new ConversionDemo();
		
		frame.add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}