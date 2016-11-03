package me.hii488.simulator;

public class Circuit {
	
	public static Grid grid;
	public static GateMap mainGateMap;
	
	public static void newCircuit(){
		grid = new Grid();
		mainGateMap = new GateMap();
		mainGateMap.mapInputs = 0;
	}
	
	public static void update(){
		
	}
	
}
