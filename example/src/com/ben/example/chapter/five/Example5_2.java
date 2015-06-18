package com.ben.example.chapter.five;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.*;

public class Example5_2 {
	public static MywindowDemo mw1 = null;
	public static MywindowDemo mw2;
	public static void main(String[] args){
		JButton butt1 = new JButton("我是第一个按钮");
		String nam1 = "我是第一个窗口";
		String name2 = "我是第二个窗口";
		JButton butt2 = new JButton("我是第二个按钮");
		
		mw1 = new MywindowDemo(nam1, butt1, Color.blue, 350, 450);
		mw1.setVisible(true);
		mw2 = new MywindowDemo(name2, butt2, Color.magenta, 300, 400);
		mw2.setVisible(true);
	}
	
	static class MywindowDemo extends JFrame{
		public MywindowDemo(String name, JButton button, Color c, int w, int h){
			super();
			setTitle(name);
			setSize(w, h);
			Container con = getContentPane();
			con.add(button);
			con.setBackground(c);
		}
	}
}
