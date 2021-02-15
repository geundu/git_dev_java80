package com.base;

import javax.swing.JFrame;

/* 
 * 메서드 매개변수(파라미터)는 없을수도, 1개, 2개 이상일 수도 있다. 
 * 메서드 호출할 때에는 매개변수와 타입이 모두 일치해야 한다.
 */

public class LoginView {
	
	
	int go(int x, int y) {
		return x+y;
	}

	public static void main(String[] args) {
		
		LoginView lv = new LoginView();
		int x = lv.go(50, 100);
		System.out.println(x);
		
		JFrame jf = new JFrame(); 
//		JFrame jf2 = new JFrame();
		String myTitle = "title";
		jf.setTitle(myTitle);
		int width = 700;
		int height = 500;
		jf.setSize(500, height);
//		jf2.setSize(width, 300);
		jf.setVisible(true);
//		jf2.setVisible(true);
	}

}
