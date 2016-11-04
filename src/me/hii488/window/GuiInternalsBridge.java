package me.hii488.window;

public class GuiInternalsBridge {
	
	public static enum Tool{
		add,
		move,
		remove,
		connect;
	}
	
	public static enum Gate{
		input,
		not,
		and,
		or,
		xor,
		compound;
	}
	
	public static Tool selectedTool = Tool.add;
	public static Gate selectedGate = Gate.input;
	public static int gateModifier = 0;
	
	
	
}
