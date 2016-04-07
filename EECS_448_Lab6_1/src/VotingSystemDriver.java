import javax.swing.JFrame;

public class VotingSystemDriver 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Voting System Demo!");
		VotingSystemDemo demo = new VotingSystemDemo();
		
		frame.add(demo.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}