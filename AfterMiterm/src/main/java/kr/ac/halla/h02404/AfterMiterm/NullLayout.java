package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullLayout extends JFrame{
	public NullLayout() {
		setTitle("NullLayout");
		setSize(500,500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(null);
		JButton b= new JButton("BUTTON");
		b.setSize(100, 100);
		b.setLocation(100,200);
		c.add(b);
		setVisible(true);
	}
	public static void main(String[] args) {
		new NullLayout();

	}

}
