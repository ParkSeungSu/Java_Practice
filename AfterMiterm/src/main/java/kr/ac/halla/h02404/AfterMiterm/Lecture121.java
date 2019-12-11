package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Lecture121 extends JFrame {
	private JLabel label;
	private JButton button;
	private JLabel result;
	private String[] answer = {"Yes","No","Cancel"};
	public Lecture121() {
		setTitle("호호");
		setSize(300,300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		result=new JLabel("");
		label= new JLabel("Y , N, Cancel");
		button=new JButton("누르세요");
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int i=JOptionPane.showConfirmDialog(Lecture121.this, "Please choose");
				result.setText("you choose : "+answer[i]);
			}
		});
		c.add(label);
		c.add(button);
		c.add(result);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lecture121();
	}

}
