package me.hii488.logicGates.simple;

import me.hii488.logicGates.LogicGate;

public class XOrGate extends LogicGate {

	@Override
	public boolean output(boolean[] inputs) {
		int count = 0;
		
		for(boolean b : inputs)
			if(b) count++;
		
		return count == 1;
	}

}
