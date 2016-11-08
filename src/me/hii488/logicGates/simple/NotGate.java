package me.hii488.logicGates.simple;

import me.hii488.logicGates.LogicGate;
import me.hii488.window.GuiInternalsBridge;

public class NotGate extends LogicGate {
	
	public NotGate(){
		this.maxInputs = 1;
		this.name = "Not";
		this.gateType = GuiInternalsBridge.Gate.not;
	}
	
	@Override
	public boolean output(boolean[] inputs) {
		this.lastOutput = !inputs[0];
		return !inputs[0];
	}

	@Override
	public NotGate clone() {
		return new NotGate();
	}

}
