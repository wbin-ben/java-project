package com.ben.example.chapter.five;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Example5_5 {
	public static void main(String[] args) {
		JLabel label1, label2, label3, label4, label5;
		JFrame mw = new JFrame("我是一个窗口");
		mw.setSize(250, 200);
		Container con = mw.getContentPane();
		con.setLayout(new BorderLayout());
		label1 = new JLabel("东标签");
		label2 = new JLabel("南标签", JLabel.CENTER);
		label3 = new JLabel("西标签");
		label4 = new JLabel("北标签", JLabel.CENTER);
		label5 = new JLabel("中标签", JLabel.CENTER);
		con.add(label1, "East");
		con.add(label2, "South");
		con.add(label3, "West");
		con.add(label4, "North");
		con.add(label5, "Center");
		mw.setVisible(true);
	}
}
