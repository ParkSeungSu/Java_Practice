package kr.ac.halla.h02404.AfterMiterm;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Lecture106 extends JFrame {
	private JMenuBar mb;
	private JTextArea label;

	public Lecture106() {
		setTitle("menu");
		setSize(500, 500);

		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		mb = new JMenuBar();
		final JFileChooser fc = new JFileChooser();
		JMenu file = new JMenu("FILE");
		JMenuItem newFile = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open File");
		JMenuItem exitItem = new JMenuItem("Exit");
		label = new JTextArea();
		file.add(newFile);
		file.add(openItem);
		file.add(exitItem);
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		c.add(label);
		newFile.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int result = fc.showSaveDialog(Lecture106.this);
				String path = fc.getSelectedFile().getPath();
				if (result != JFileChooser.APPROVE_OPTION)
					return;
				try {
					BufferedWriter bw = new BufferedWriter(new FileWriter(path));
					String r = label.getText();
					bw.write(r);
					bw.flush();
					bw.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		openItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int result = fc.showOpenDialog(Lecture106.this);
				if (result == JFileChooser.APPROVE_OPTION) {
					String path = fc.getSelectedFile().getPath();
					try {
						String line = "";
						BufferedReader bf = new BufferedReader(new FileReader(path));
						while (true) {
							String s = bf.readLine();
							if (s == null)
								break;
							line += "\n" + bf.readLine();
						}
						label.setText(line);
						bf.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});
		exitItem.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(1);

			}
		});
		mb.add(file);
		setJMenuBar(mb);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Lecture106();

	}

}
