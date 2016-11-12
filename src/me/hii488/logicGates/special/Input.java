package me.hii488.logicGates.special;

import me.hii488.logicGates.LogicGate;
import me.hii488.logicGates.Toggleable;
import me.hii488.simulator.Circuit;
import me.hii488.window.GuiInternalsBridge;

public class Input extends LogicGate implements Toggleable{
	
	public boolean output = false;
	
	public Input(){
		this.name = "Input";
		this.maxInputs = 0;
		this.gateType = GuiInternalsBridge.Gate.input;
	}
	
	public boolean output(boolean[] inputs){
		return output;
	}

	@Override
	public void toggle() {
		output = !output;
		Circuit.update();
	}

	@Override
	public Input clone() {
		return new Input();
	}
	
	
	
}
