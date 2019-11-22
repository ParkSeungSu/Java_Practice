package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Lecture91 extends JFrame{
	private JTextField name;
	private JButton submit;
	private JTextField subject;
	private JTextArea area;
	private JTextField id;
	private JTextField pass;

	public Lecture91() {
		setSize(350, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setTitle("회원가입");
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("이름"));
		id=new JTextField(26);
		pass=new JTextField(26);
		name=new JTextField(20);
		area=new JTextArea(10, 14);
		area.setFont(new Font("broadway",1,20));
		area.setAlignmentY(CENTER_ALIGNMENT);
		submit=new JButton("제출");
		submit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				area.setText(name.getText()+"\n"+subject.getText()+"\n"+id.getText()+"\n"+pass.getText());
			}
		});
		c.add(name);
		c.add(submit);
		c.add(new JLabel("학과"));
		subject=new JTextField(26);
		c.add(subject);
		c.add(new JLabel(" ID "));
		c.add(id);
		c.add(new JLabel(" PW "));
		c.add(pass);
		c.add(area);
		
		
		
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Lecture91();

	}

}
