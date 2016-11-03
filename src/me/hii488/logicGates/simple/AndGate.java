package me.hii488.logicGates.simple;

import me.hii488.logicGates.LogicGate;

public class AndGate extends LogicGate {

	public AndGate(){
		this.maxInputs = -1;
		this.name = "Or";
	}
	
	@Override
	public boolean output(boolean[] inputs) {
		
		boolean output = true;
		
		for(boolean b : inputs) // Technically not optimised from a time point of view, but only an issue if 1000s of inputs.
			if(!b) output = false;
		
		return output;
	}

}
