package me.hii488.logicGates.simple;

import me.hii488.logicGates.LogicGate;
import me.hii488.window.GuiInternalsBridge;

public class OrGate extends LogicGate{
	
	public OrGate(){
		this.maxInputs = -1;
		this.name = "Or";
		this.gateType = GuiInternalsBridge.Gate.or;
	}
	
	@Override
	public boolean output(boolean[] inputs) {
		
		boolean output = false;
		
		for(boolean b : inputs) // Technically not optimised from a time point of view, but only an issue if 1000s of inputs.
			if(b) output = true;
		
		return output;
	}

	@Override
	public OrGate clone() {
		return new OrGate();
	}
}
