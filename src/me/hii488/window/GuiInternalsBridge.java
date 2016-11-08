package me.hii488.window;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class GuiInternalsBridge {
	
	public static enum Tool{
		add,
		move,
		remove,
		connect;
	}
	
	public static enum Gate{
		input(0),
		not(550),
		and(1180),
		or(2400),
		xor(3600),
		compound(-1);
		
		int x;
		Gate(int x){this.x = x;}
	}
	
	public static Tool selectedTool = Tool.add;
	public static Gate selectedGate = Gate.input;
	public static int gateModifier = 0;
	
	public static Image gates = new ImageIcon("resources\\textures\\logicGates\\USLogicGates.png").getImage();
	
	public static void renderAboutMouse(Graphics g){
		if(selectedTool == Tool.add){
			if(selectedGate.x != 0){
				g.drawImage(gates, Listener.mouseX-20, Listener.mouseY-20, Listener.mouseX+20, Listener.mouseY+20, selectedGate.x, 000, selectedGate.x + 320, 300, null);
			}
		}
	}
	
}
