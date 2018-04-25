package GUI_Frame_Button;

import javax.swing.JFrame;

public class ButtonCounter {

	public static void main(String[] args) { 
		
		ButtonCounterUI frame = new ButtonCounterUI();
		//frame.add(button, BorderLayout.NORTH);

		//EXIT_ON_CLOSE static, gilt für alle Objekte -> Aufruf über Klasse.var
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setTitle("Programm");
		frame.setVisible(true);
		
	}
	
}
