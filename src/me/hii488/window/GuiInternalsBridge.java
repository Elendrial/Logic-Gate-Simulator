package me.hii488.window;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import javax.swing.ImageIcon;

import me.hii488.logicGates.LogicGate;
import me.hii488.logicGates.simple.AndGate;
import me.hii488.logicGates.simple.NotGate;
import me.hii488.logicGates.simple.OrGate;
import me.hii488.logicGates.simple.XOrGate;
import me.hii488.logicGates.special.CompoundGate;
import me.hii488.logicGates.special.Input;
import me.hii488.simulator.Circuit;

public class GuiInternalsBridge {
	
	public static enum Tool{
		add,
		move,
		remove,
		connect;
	}
	
	public static enum Gate{
		input(0, new Input()),
		not(550, new NotGate()),
		and(1180, new AndGate()),
		or(2400, new OrGate()),
		xor(3600, new XOrGate()),
		compound(-1, new CompoundGate());
		
		public int iconXPos;
		private LogicGate l;
		Gate(int x, LogicGate l){this.iconXPos = x; this.l = l;}
		
		public LogicGate getGate(){
			return l.clone();
		}
	}
	
	public static Tool selectedTool = Tool.add;
	public static Gate selectedGate = Gate.input;
	public static int gateModifier = 0;
	
	public static Image gates = new ImageIcon("resources\\textures\\logicGates\\USLogicGates.png").getImage();
	
	public static void renderAboutMouse(Graphics g){
		if(selectedTool == Tool.add){
			if(selectedGate.iconXPos > 0){
				g.drawImage(gates, Listener.mouseX-20, Listener.mouseY-20, Listener.mouseX+20, Listener.mouseY+20, selectedGate.iconXPos, 000, selectedGate.iconXPos + 320, 300, null);
			}
		}
	}
	
	public static void placeGate(){
		Circuit.addGate(selectedGate.getGate(), new Point(Listener.mouseX/20, Listener.mouseY/20));
	}
	
	public static void removeGate(){
		Circuit.removeGate(new Point(Listener.mouseX/20, Listener.mouseY/20));
	}
	
}
