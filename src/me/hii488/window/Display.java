package me.hii488.window;

import java.awt.Canvas;
import java.awt.Graphics;

import me.hii488.simulator.Circuit;


@SuppressWarnings("serial")
public class Display extends Canvas{
	
	public void render(Graphics g){
		if(Circuit.isSetup){
			Circuit.grid.render(g);
			GuiInternalsBridge.renderAboutMouse(g);
		}
		
	}
	
}
