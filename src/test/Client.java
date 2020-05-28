package test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Client extends JFrame implements ActionListener{
	JFrame jframe =new JFrame("Dictionary");
	JPanel up=new JPanel();
	JPanel down=new JPanel();
	JButton confirm=new JButton("Search");
	JTextField searchfield=new JTextField(30);
	JTextArea information=new JTextArea(20,50);
	Dictionary dictionary1=new Thedictionary();
	Dictionary dictionary2=new Anatherdictionary();
	public 	Client() {
		jframe.setLayout(new FlowLayout());
		up.setLayout(new FlowLayout());
		confirm.addActionListener(this);
		information.setLineWrap(true);
		up.add(searchfield);
		up.add(confirm);
		down.add(information);
		jframe.add(up);
		jframe.add(down);
		jframe.setSize(600,400);
		jframe.setLocationRelativeTo(null);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Client();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==confirm) {
			//information.setText("good!");
			String word=searchfield.getText();
			
			if(!word.equals("")) {
				//String content=dictionary.Search(word);
				String content=dictionary2.Search(word);
				if(content==null) {
					information.setText("");
					new Error();
				}
				else {
					information.setText(word+"  :  "+content);
				}
				
			}
			//information.setText(word);
			//new Error();
		}
	}




}
