package com.test.lab7;

import javax.swing.JFrame;
import com.test.lab7.MyScreen;

	public class Control 
	{
		
		public static void main(String[] args)
		{
			MyScreen newScreen = new MyScreen("Lab7");
			newScreen.setLocation(400,220);
			newScreen.setSize(400,400);
			newScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		

	}

