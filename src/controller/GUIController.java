package controller;


import model.Dwight;
import view.*;
import view.Frame;
import view.Panel;


public class GUIController
{
	private Dwight myDwight;
	private Frame appFrame;
	private Panel appLayout;

	public GUIController()
	{
		this.myDwight = new Dwight();
		this.appFrame = new Frame(this);
		this.appLayout = new Panel(this);
	}
	
	public void start()
	{
		
	}
}
