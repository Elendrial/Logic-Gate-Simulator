package me.hii488.logicGates.special;

import me.hii488.logicGates.LogicGate;
import me.hii488.logicGates.Toggleable;
import me.hii488.simulator.Circuit;

public class Input extends LogicGate implements Toggleable{
	
	public boolean output = false;
	
	public Input(){
		this.name = "Input";
		this.maxInputs = 0;
	}
	
	public boolean output(boolean[] inputs){
		return output;
	}

	@Override
	public void toggle() {
		output = !output;
		Circuit.update();
	}
	
}
