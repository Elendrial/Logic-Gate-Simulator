package me.hii488.simulator;

import java.util.ArrayList;

import me.hii488.logicGates.LogicGate;

public class GateMap {
	
	ArrayList<Layer> gateLayers = new ArrayList<Layer>();
	
	public int mapInputs = 0;
	public boolean[] inputs = null;
	
	private boolean lastOutput = false;
	
	public void init(){
		Layer inputLayer = new Layer();
		if(mapInputs > 0){
			inputs = new boolean[mapInputs];
			for(int i = 0; i < mapInputs; i++){
				DummyGate d = new DummyGate();
				d.ID = i;
				inputLayer.gates.add(d);
			}
		}
		gateLayers.add(inputLayer);
	}
	
	public void update(){
		update(null);
	}
	
	public void update(boolean[] inputs){
		if(inputs !=null){
			for(int i = 0; i < mapInputs; i++){
				((DummyGate)gateLayers.get(0).gates.get(i)).fixedOutput = inputs[i];
			}
		}
	}
	
	public boolean output(){
		return lastOutput;
	}
	
	
	class Layer{
		public ArrayList<LogicGate> gates = new ArrayList<LogicGate>();
		public int ID;
		
		
	}
	
	
	class DummyGate extends LogicGate{
		// Exists only as a placeholder for inputs.
		
		public boolean fixedOutput = false;
		
		@Override
		public boolean output(boolean[] inputs) {
			return fixedOutput;
		}
		
	}
	
}
