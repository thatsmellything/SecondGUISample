package view;

import javax.swing.JFrame;
import controller.GUIController;

public class Frame extends JFrame
{
	private GUIController appController;
	private Panel appPanel;
	
	public Frame(GUIController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new Panel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(800, 800);
		this.setTitle("My Second GUI");
		this.setResizable(true);
		this.setVisible(true);
	}

}
