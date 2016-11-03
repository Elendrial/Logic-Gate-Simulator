package me.hii488.simulator;

import java.awt.Point;
import java.util.HashMap;

import me.hii488.General.Settings;
import me.hii488.logicGates.LogicGate;

public class Grid {
	
	// This is purely for aesthetics, GateMap will have circuit handling things.
	
	static int gridWidth, gridHeight;
	
	private static HashMap<Point, LogicGate> grid = new HashMap<Point, LogicGate>();
	
	public static void addLogicGate(LogicGate l, Point p){
		grid.put(p, l);
		if(Settings.DEBUG) System.out.println("Logic Gate \"" + l.getName() + "\" added to point: " + p.toString()); 
	}
	
	public static void removeLogicGate(Point p){
		grid.remove(p);
	}
	
}
