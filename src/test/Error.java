package test;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Error extends JFrame{
	
	public Error() {
		JFrame error=new JFrame("Error");
		//JPanel a=new JPanel();
		JLabel label=new JLabel("�ʵ��в����ڸôʣ�����������");
		error.add(label);
		error.setSize(200,100);
		error.setLocationRelativeTo(null);
		//error.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		error.setVisible(true);
	}
	
}
