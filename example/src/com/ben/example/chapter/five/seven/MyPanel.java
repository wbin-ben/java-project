package com.ben.example.chapter.five.seven;

import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel{
	int x;
	JLabel label1;
	MyPanel(int a){
		x = a;
		getSize();
		label1 = new JLabel("我是第" + x + "个标签");
		add(label1);
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(200, 500);
	}
}
