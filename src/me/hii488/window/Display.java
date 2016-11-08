package me.hii488.window;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import me.hii488.general.MainController;


@SuppressWarnings("serial")
public class Display extends Canvas{
	
	public void render(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.GRAY);
		
		for(int i = 0; i < MainController.mainWindow.gridFrame.getWidth()/20; i++){
			g.drawLine(i*20, 0, i*20, MainController.mainWindow.gridFrame.getHeight());
		}
		
		g.setColor(Color.GRAY);
		
		for(int i = 0; i < MainController.mainWindow.gridFrame.getHeight()/20; i++){
			g.drawLine(0, i*20, MainController.mainWindow.gridFrame.getWidth(), i*20);
		}
		g.setColor(c);
		
		
		GuiInternalsBridge.renderAboutMouse(g);
		
	}
	
}
