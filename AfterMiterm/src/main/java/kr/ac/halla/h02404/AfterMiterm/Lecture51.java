package kr.ac.halla.h02404.AfterMiterm;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Lecture51 extends JFrame{
	JButton j=new JButton("ME");
	public Lecture51() {
		setTitle("Action Listener");
		setSize(100, 100);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container container=getContentPane();
		container.setLayout(null);
		j.setSize(50, 50);
		j.setLocation(container.getX()+400,container.getX()+400);
		container.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void mouseClicked(MouseEvent e) {
				if(e.getButton()==MouseEvent.BUTTON1)
				j.setLocation(e.getPoint());
				
			}
		});
		container.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent e) {
				
				
			}
			
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				j.setLocation(e.getPoint());
			}
		});
		j.addKeyListener(new KeyListener() {
			
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			public void keyPressed(KeyEvent e) {
				
				j.setText(String.valueOf(e.getKeyChar()));
				if(e.getKeyCode()==KeyEvent.VK_W||e.getKeyCode()==KeyEvent.VK_UP)
					j.setLocation(j.getX(), j.getY()-10);
				else if(e.getKeyCode()==KeyEvent.VK_S||e.getKeyCode()==KeyEvent.VK_DOWN)
					j.setLocation(j.getX(), j.getY()+10);
				else if(e.getKeyCode()==KeyEvent.VK_A||e.getKeyCode()==KeyEvent.VK_LEFT)
					j.setLocation(j.getX()-10, j.getY());
				else if(e.getKeyCode()==KeyEvent.VK_D||e.getKeyCode()==KeyEvent.VK_RIGHT)
					j.setLocation(j.getX()+10, j.getY());
				else if(e.getKeyCode()==KeyEvent.VK_SPACE)
					j.setLocation(j.getX(), j.getY()-100);
				System.out.println(j.getX()+", "+j.getY());
				if(j.getX()>430&&j.getY()<5) {
					Runtime runtime=Runtime.getRuntime();
					try {
						runtime.exec("explorer.exe https://www.naver.com");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		
		container.add(j);
		Timer timer=new Timer(100, new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//0.1초마다 해야할 일..
				if(j.getY()<=450) {
					j.setLocation(j.getX(), j.getY()+5);
				}
				
			}
		});
		
		timer.start();
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Lecture51();
		
	}

}
