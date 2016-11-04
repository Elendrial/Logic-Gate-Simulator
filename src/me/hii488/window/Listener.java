package me.hii488.window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import me.hii488.general.MainController;
import me.hii488.simulator.Circuit;

public class Listener implements MouseListener, MouseMotionListener, KeyListener, ActionListener, ItemListener{

	@Override
	public void keyPressed(KeyEvent arg0) {
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		
	}

	// GUI MENU THINGS
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// Menu Items
		if(arg0.getSource().equals(MainController.mainWindow.Exit)){
			MainController.endProgram();
		}
		if(arg0.getSource().equals(MainController.mainWindow.createNew)){
			Circuit.newCircuit();
		}
		if(arg0.getSource().equals(MainController.mainWindow.open)){
			//TODO: Loading saved circuits.
		}
		if(arg0.getSource().equals(MainController.mainWindow.save)){
			//TODO: Save circuits.
		}
		
		//Tool bar items
		if(arg0.getSource().equals(MainController.mainWindow.moveTool)){
			GuiInternalsBridge.selectedTool = GuiInternalsBridge.Tool.move;
		}
		if(arg0.getSource().equals(MainController.mainWindow.addTool)){
			GuiInternalsBridge.selectedTool = GuiInternalsBridge.Tool.add;
		}
		if(arg0.getSource().equals(MainController.mainWindow.removeTool)){
			GuiInternalsBridge.selectedTool = GuiInternalsBridge.Tool.remove;
		}
		if(arg0.getSource().equals(MainController.mainWindow.connectTool)){
			GuiInternalsBridge.selectedTool = GuiInternalsBridge.Tool.connect;
		}
		
		// Logic tool bar items
		if(arg0.getSource().equals(MainController.mainWindow.notGate)){
			GuiInternalsBridge.selectedGate = GuiInternalsBridge.Gate.not;
		}
		if(arg0.getSource().equals(MainController.mainWindow.orGate)){
			GuiInternalsBridge.selectedGate = GuiInternalsBridge.Gate.or;
		}
		if(arg0.getSource().equals(MainController.mainWindow.andGate)){
			GuiInternalsBridge.selectedGate = GuiInternalsBridge.Gate.and;
		}
		if(arg0.getSource().equals(MainController.mainWindow.xorGate)){
			GuiInternalsBridge.selectedGate = GuiInternalsBridge.Gate.xor;
		}
	}

}
