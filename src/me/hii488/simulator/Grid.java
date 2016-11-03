package me.hii488.simulator;

import java.awt.Point;
import java.util.HashMap;

import me.hii488.General.Settings;
import me.hii488.logicGates.LogicGate;

public class Grid {
	
	// This is purely for aesthetics, GateMap will have circuit handling things.
	
	private int width, height; // Private to force use of setDimensions();
	
	private HashMap<Point, LogicGate> grid = new HashMap<Point, LogicGate>();
	
	public void addLogicGate(LogicGate l, Point p){
		grid.put(p, l);
		if(Settings.DEBUG) System.out.println("Logic Gate \"" + l.getName() + "\" added to point: " + p.toString()); 
	}
	
	public void removeLogicGate(Point p){
		grid.remove(p);
	}
	
	public boolean setDimensions(int newWidth, int newHeight){
		for(Point p : grid.keySet()){
			if(p.x > newWidth || p.y > newHeight){
				return false;
			}
		}
		
		this.width = newWidth;
		this.height = newHeight;
		
		return true;
	}
	
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	
}
