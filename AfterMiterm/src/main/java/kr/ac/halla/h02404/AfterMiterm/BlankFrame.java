package kr.ac.halla.h02404.AfterMiterm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

public class BlankFrame extends JFrame{
	//생성자에서 jframe 꾸미기
	public BlankFrame() {
		setTitle("BlankFrame");
		setSize(400, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBackground(Color.gray);
		
		Container container=getContentPane();
		container.setLayout(new BorderLayout());
		container.add(new JButton("WEST"),BorderLayout.WEST);
		container.add(new JButton("EAST"),BorderLayout.EAST);
		JEditorPane ed=new JEditorPane();
		ed.setAlignmentX(CENTER_ALIGNMENT);
		container.add(ed,BorderLayout.NORTH);
		container.add(new JButton("SOUTH"),BorderLayout.SOUTH);
		container.add(new JButton("CENTER"),BorderLayout.CENTER);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		new BlankFrame();

	}

}
