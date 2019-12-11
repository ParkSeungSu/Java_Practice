package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Lecture111 extends JFrame{
	private JTextArea textArea;
	private JLabel label;
	private JButton button;
	private JFrame jFrame;
	private Container c;
	public Lecture111() {
		setTitle("Jdialog");
		setSize(400,800);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		textArea=new JTextArea(20, 30);
		button=new JButton("열기");
		this.jFrame=this;
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new MyDialog(jFrame);
			
			}
		});
		label=new JLabel("not changed");
		c.add(label);
		c.add(button);
		c.add(textArea);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lecture111();
	}

}
