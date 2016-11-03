package me.hii488.window;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class Display extends Canvas{

	public Display(Window window) {
		setBounds(0, 0, window.width, window.height);
	}
	
	public void render(Graphics g){
		Color c = g.getColor();
		g.setColor(Color.gray);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		g.setColor(c);
		
	}
	
}
