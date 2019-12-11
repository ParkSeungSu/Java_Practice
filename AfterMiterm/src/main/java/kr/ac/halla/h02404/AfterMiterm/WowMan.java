package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WowMan extends JFrame {
	private int count=1;
	public WowMan() {
		setSize(400, 400);
		setTitle("Wow");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton b = new JButton("hello");
		b.addActionListener( e -> {
			System.out.println("gg");
		});
		c.add(b);
		setVisible(true);
	}

	public static void main(String[] args) {
		new WowMan();
	}
	
	ActionListener action= new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			if(count%2==0) {
			System.out.println("Hellow World");
			}else {
				System.out.println("Young Man");
			}
			count++;
			
		}
	};

}
