package com.ben.example.chapter.five;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example5_1 {
	public static void main(String[] args) {
		JFrame mw = new JFrame("我的第一个窗口");
		mw.setSize(250, 200);
		JButton button = new JButton("我是一个按钮");
		mw.getContentPane().add(button);
		mw.setVisible(true);
	}
}
