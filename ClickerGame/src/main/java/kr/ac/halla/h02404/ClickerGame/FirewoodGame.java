package kr.ac.halla.h02404.ClickerGame;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class FirewoodGame extends JFrame {
	private double money = 0;
	private JLabel label;
	private JButton woodBt;
	private JButton drug;
	private int level = 1;
	private int numWood = 0;
	private JButton woodSeller;
	private int woodLevel = 1;
	private JButton lotto;
	AudioInputStream stream;
	Clip clip;
	File file;
	public FirewoodGame() {
		file = new File("img/att-sound1-9.wav");
		ImageIcon originicon = new ImageIcon("img/Wood_Beam_Firewood_Plank_Timber-14-512.png");
		Image originImg = originicon.getImage();
		Image chanImage = originImg.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		
		try {
			stream = AudioSystem.getAudioInputStream(file);  
			clip = AudioSystem.getClip();
			clip.open(stream);
		} catch (UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (LineUnavailableException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ImageIcon originicon2 = new ImageIcon("img/img_491935.png");
		Image originImg2 = originicon2.getImage();
		Image chanImage2 = originImg2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);

		ImageIcon originicon3 = new ImageIcon("img/919-39-512.png");
		Image originImg3 = originicon3.getImage();
		Image chanImage3 = originImg3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		
		setTitle("FireWoodGame");
		setSize(800, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		label = new JLabel("Money :" + money + "$" + ", Wood : " + numWood);
		label.setLocation(20, 20);
		label.setSize(400, 50);
		woodBt = new JButton("장작", new ImageIcon(chanImage));
		woodBt.setBorderPainted(false);
		woodBt.setContentAreaFilled(false);
		woodBt.setSize(300, 300);
		woodBt.setLocation(20, 100);
		woodBt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				clip.stop();
				money += level;
				numWood++;
				label.setText("Money :" + money + "$" + ", Wood : " + numWood);
				clip.start();

			}
		});
		drug = new JButton("Drug Lv." + level + "=" + (50 * level) + "$", new ImageIcon(chanImage2));
		drug.setSize(200, 50);
		drug.setLocation(500, 100);
		drug.setBorderPainted(false);
		drug.setContentAreaFilled(false);
		drug.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (money < (50 * level))
					return;
				money = money - (50 * level);
				level++;
				drug.setText("Drug Lv." + level + "=" + (50 * level) + "$");
				label.setText("Money :" + money + "$" + ", Wood : " + numWood);

			}
		});
		woodSeller = new JButton("장작상인 Lv." + woodLevel + "=" + (100 * woodLevel),new ImageIcon(chanImage3));
		woodSeller.setLocation(500, 200);
		woodSeller.setSize(200, 50);
		woodSeller.setBorderPainted(false);
		woodSeller.setContentAreaFilled(false);
		woodSeller.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				Timer timer = new Timer(100, new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						if (numWood > 0) {
							numWood--;
							money = money + (20 * woodLevel);
							drug.setText("Drug Lv." + level + "=" + (50 * level) + "$");
							label.setText("Money :" + money + "$" + ", Wood : " + numWood);

						}

					}
					
				});
				timer.start();
				

			}
		});
		lotto=new JButton("행운버튼");
		lotto.setLocation(500, 300);
		lotto.setSize(200, 50);
		lotto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Random r= new Random();
				int num=r.nextInt(9);
				if(num>4) {
					money=money*2;
					drug.setText("Drug Lv." + level + "=" + (50 * level) + "$");
					label.setText("Money :" + money + "$" + ", Wood : " + numWood);
				}else {
					money=money/2;
					if(level>=2) {
						level--;
					}
					drug.setText("Drug Lv." + level + "=" + (50 * level) + "$");
					label.setText("Money :" + money + "$" + ", Wood : " + numWood);
				}
				
			}
		});
		c.add(label);
		c.add(woodBt);
		c.add(drug);
		c.add(woodSeller);
		c.add(lotto);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirewoodGame();
	}

}
