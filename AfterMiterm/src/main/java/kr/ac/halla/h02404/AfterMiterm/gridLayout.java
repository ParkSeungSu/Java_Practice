package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class gridLayout extends JFrame{
	public gridLayout() {
		setTitle("GridLayout");
		setSize(500, 500);
		Container c=getContentPane();
		GridLayout layout=new GridLayout();
		
		layout.setRows(5);
		layout.setColumns(3);
		//new GridLayout(3,5);
		c.setLayout(layout);
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		c.add(new JButton("7"));
		c.add(new JButton("8"));
		c.add(new JButton("9"));
		c.add(new JButton("AC"));
		c.add(new JButton("0"));
		c.add(new JButton("="));
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new gridLayout();
	}

}
