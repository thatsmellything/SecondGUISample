package controller;


import model.Dwight;
import view.*;


public class GUIController
{
	private Dwight myDwight;
	private Frame appFrame;
	private Panel appLayout;

	public GUIController()
	{
		myDwight = new Dwight();
		appFrame = new Frame(this);
		appLayout = new Panel(this);
	}
	
	public void start()
	{
		
	}
}
