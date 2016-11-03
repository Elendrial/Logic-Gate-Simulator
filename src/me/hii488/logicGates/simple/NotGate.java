package me.hii488.logicGates.simple;

import me.hii488.logicGates.LogicGate;

public class NotGate extends LogicGate {
	
	public NotGate(){
		this.maxInputs = 1;
		this.name = "Not";
	}
	
	@Override
	public boolean output(boolean[] inputs) {
		this.lastOutput = !inputs[0];
		return !inputs[0];
	}

}
