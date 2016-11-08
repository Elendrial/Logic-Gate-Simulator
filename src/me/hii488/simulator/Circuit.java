package me.hii488.simulator;

import java.awt.Point;

import me.hii488.logicGates.LogicGate;

public class Circuit {
	
	public static Grid grid;
	public static GateMap mainGateMap;
	
	public static boolean isSetup = false;
	
	public static void newCircuit(){
		grid = new Grid();
		mainGateMap = new GateMap();
		mainGateMap.mapInputs = 0;
		mainGateMap.init();
		
		isSetup = true;
	}
	
	public static void update(){
		
	}
	
	public static void addGate(LogicGate l, Point p){
		grid.addLogicGate(l, p);
		
	}
	
}
