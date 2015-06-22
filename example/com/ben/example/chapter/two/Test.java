package com.ben.example.chapter.two;

public class Test {
	public static void main(String[] args) {
		/**习题１**/
//		System.out.println('测'+1);
//		System.out.println(('a' + 'b'));
		/**习题９**/
//		int x = 5, y = 110;
//		do{
//			x = y/x;
//			y = y - x;
//			System.out.println(x+"-"+y);
//		}while(y >=1);
		/**习题５**/
//		int x = 1, j = 1;
//		System.out.println(x);
//		x = 1;
//		System.out.println(x++);
//		System.out.println(x);
//		x = 1;
//		System.out.println(++x);
//		System.out.println(x);
		/**习题６**/
		for(int i = 1; i <= 1000; i ++){
			int sum = 0;
			for(int j = 1; j < i; j++){
				if(i%j == 0){
					sum += j;
				}
			}
			if(i == sum){
				System.out.print("\t"+i);
			}
		}
	}
}
