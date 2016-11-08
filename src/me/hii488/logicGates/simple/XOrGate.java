package me.hii488.logicGates.simple;

import me.hii488.logicGates.LogicGate;
import me.hii488.window.GuiInternalsBridge;

public class XOrGate extends LogicGate {
	
	public XOrGate(){
		this.maxInputs = -1;
		this.name = "XOr";
		this.gateType = GuiInternalsBridge.Gate.and;
	}
	
	@Override
	public boolean output(boolean[] inputs) {
		int count = 0;
		
		for(boolean b : inputs)
			if(b) count++;
		
		return count == 1;
	}

	@Override
	public XOrGate clone() {
		// TODO Auto-generated method stub
		return new XOrGate();
	}

}
