package view;

import javax.swing.*;
import controller.GUIController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel
{

	private GUIController appController;
	private JButton myButton;
	private JLabel myLabel;
	private SpringLayout appLayout;
	
	public Panel(GUIController appController)
	{
		super();
		
		this.appController = appController;
		myButton = new JButton("CLICK!");
		myLabel = new JLabel("This is a color app");
		appLayout = new SpringLayout();
		appLayout.putConstraint(SpringLayout.NORTH, myButton, 151, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myButton, -96, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, myLabel, 188, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, myLabel, -54, SpringLayout.NORTH, myButton);
		
	
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(myLabel);
		this.add(myButton);
		
		this.setBackground(Color.BLUE);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.WEST, myButton, 201, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		myButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent mouseClick)
			{
				changeColor();
			}
			
		});
	}
	
	
	private void changeColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
}
