package me.hii488.logicGates.special;

import me.hii488.logicGates.LogicGate;
import me.hii488.simulator.GateMap;

public class CompoundGate extends LogicGate{
	// This is a gate made from multiple gates.
	
	GateMap gm = new GateMap();
	
	public CompoundGate(){
		this.name = "Compound";
	}
	
	public void changeName(String newName){
		this.name = newName;
	}
	
	@Override
	public boolean output(boolean[] inputs) {
		gm.inputs = this.input;
		return gm.output();
	}
	
}
