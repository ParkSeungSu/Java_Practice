package kr.ac.halla.h02404.AfterMiterm;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Lecture52 extends JFrame{
	public Lecture52() {
		setTitle("sfw");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(300, 300);
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		JButton bt=new JButton("또실행");
		bt.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Lecture52();
				
			}
		});
		c.add(bt);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lecture52();
	}

}
