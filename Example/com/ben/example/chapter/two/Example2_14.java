package com.ben.example.chapter.two;

import javax.swing.JOptionPane;

public class Example2_14 {
		public static void main(String[] args){
			int n, j, k, space;
			String result = (String) JOptionPane.showInputDialog(null, "请输入一个整数", "输入对话框", JOptionPane.PLAIN_MESSAGE, null, null, null);
			n = Integer.parseInt(result);
			space = 40;
			for(j = 0; j <= n; j++, space -= 3){
				for(int i = 0; i < space; i++)
					System.out.print(" ");
				for(k = 1; k <= 2 * j + 1; k++)
					System.out.print(" *");
				System.out.print("\n");
			}
			
			space += 6;
			for(j = n-1; j >= 0; j--, space += 3){
				for(int i = 0; i < space; i++)
					System.out.print(" ");
				for(k =1; k <= 2*j +1; k++)
					System.out.print(" *");
				System.out.print("\n");
			}		
		}
}
