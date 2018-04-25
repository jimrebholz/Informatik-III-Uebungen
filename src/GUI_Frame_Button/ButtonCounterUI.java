package GUI_Frame_Button;

import javax.swing.JFrame;
import javax.swing.JButton;

public class ButtonCounterUI extends JFrame{

	private JButton button = new JButton("Click me...");
	
	public ButtonCounterUI() {
		
		super("Programm");
		add(button);
		//Button wird über ActionListener registriert -> ActionListener braucht actionPerformed
		button.addActionListener(new ButtonCounterController());
	}
	
}
