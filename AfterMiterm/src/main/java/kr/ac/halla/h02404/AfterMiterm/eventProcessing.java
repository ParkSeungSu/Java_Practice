package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class eventProcessing extends JFrame{
	public static int count=0;
	public eventProcessing() {
		ImageIcon icon=new ImageIcon("src/묻고_떠블러_가.jpg");
		
		setTitle("event");
		setSize(600,300);
		Container t=getContentPane();
		t.setLayout(new FlowLayout());
		JButton b=new JButton("naver");
		JLabel label=new JLabel(icon);
		
		//ActionListener 인터페이스를 구현한 클래스의 인스턴트를 넣는다
		JButton b2=new JButton("Daum");
		b2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.out.println("Daum Open");
				Runtime runtime=Runtime.getRuntime();
				try {
					count++;
					System.out.println(count);
					runtime.exec("explorer.exe https://www.daum.net//");
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		});
		b.addActionListener(new myActionListener());
		t.add(b);
		t.add(b2);
		t.add(label);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new eventProcessing();
	}

}

	
