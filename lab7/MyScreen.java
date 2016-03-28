package com.test.lab7;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyScreen extends JFrame implements ActionListener, MouseListener
{
	
	JTextField text1;
	JTextField text2;
	JButton button1;
	JButton button2;
	
	public MyScreen(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		
		button1 = new JButton("Click here");
		button1.addActionListener(this);
		add(button1);
		
		text1 = new JTextField("", 20);
		add(text1);
		addMouseListener(this);
		setVisible(true);
		
		text2 = new JTextField("",20);
		add(text2);
		
		button2 = new JButton("Button 2");
		button2.addActionListener(this);
		add(button2);
		
		
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		JOptionPane.showMessageDialog(this,"Mouse Clicked");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == button1)
		{
			//JOptionPane.showMessageDialog(this, text1.getText());
			String content = text1.getText();
			String content2 = text2.getText();
			
			
			if(content2.length() == 1 )
			{
				if(content.charAt(0) == content2.charAt(0))
				{
						JOptionPane.showMessageDialog(this, "Same");
				}//end inner inner if 
			
		
			}//end inner if 
			else
			{
				JOptionPane.showInputDialog(this, "It's not the Same");
			}//end inner else
		}//end outer if
			
		else if (arg0.getSource() == button2)
		{
			JOptionPane.showMessageDialog(null, "Not the edit checking");
		}//end else if
			
			
	}//end ActionEvent
}//end class
	
				

		


