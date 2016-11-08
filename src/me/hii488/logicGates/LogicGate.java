package me.hii488.logicGates;

import me.hii488.window.GuiInternalsBridge;

public abstract class LogicGate {
	
	public boolean[] input;
	public int maxInputs = -1;
	public boolean lastOutput;
	
	public GuiInternalsBridge.Gate gateType;
	protected String name;
	public int ID;
	public int[] inputIDs;
	
	public boolean output(){
		boolean b = output(input);
		this.lastOutput = b;
		return b;
	}
	
	public abstract boolean output(boolean[] inputs);
	
	public String getName(){
		return name;
	}
	
	public abstract LogicGate clone();
	
}
