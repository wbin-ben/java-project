package com.ben.example.chapter.five;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	JButton button1, button2;
	JLabel label;
	MyPanel(String s1, String s2, String s3){
		button1 = new JButton(s1);
		button2 = new JButton(s2);
		label = new JLabel(s3);
		add(button1);
		add(button2);
		add(label);
	}
}
