package me.hii488.window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import me.hii488.general.MainController;
import me.hii488.general.Settings;

public class Window implements Runnable {

	// Actual window
	public JFrame gridFrame;
	public Display display;

	public int width, height;
	public String title;

	// How often we want the game to tick per second
	public int targetTPS;
	
	// GUI elements
	public JMenuBar menuBar;
	public JMenu file = new JMenu("File"), other = new JMenu("Other");
	public JMenuItem createNew = new JMenuItem("New", KeyEvent.VK_N), open = new JMenuItem("Open", KeyEvent.VK_O), save = new JMenuItem("Save", KeyEvent.VK_S), Exit = new JMenuItem("Exit", KeyEvent.VK_E);
	public JMenuItem prefs = new JMenuItem("Preferences", KeyEvent.VK_P);
	

 	public Window(String title, int width, int height) {
		// Set the variables
		this.title = title;
		this.width = width;
		this.height = height;

		// Setup Window
		this.gridFrame = new JFrame(title);
		this.gridFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.gridFrame.getContentPane().setPreferredSize(new Dimension(width, height));
		
		createGUI();
		
		this.gridFrame.setResizable(true);
		this.gridFrame.pack();
		this.gridFrame.setLocationRelativeTo(null);
		this.gridFrame.setVisible(true);
	}
	
	public void createGUI(){
		this.display = new Display(this);
		display.addKeyListener(MainController.inputListener);
		display.addMouseListener(MainController.inputListener);
		this.gridFrame.add(this.display);
		
		// GUI Stuff
		menuBar = new JMenuBar();
		
		menuBar.add(file);
		menuBar.add(other);
		
		createNew.addActionListener(MainController.inputListener);
		file.add(createNew);
		
		open.addActionListener(MainController.inputListener);
		file.add(open);
		
		save.addActionListener(MainController.inputListener);
		file.add(save);
		
		file.addSeparator();
		
		Exit.addActionListener(MainController.inputListener);
		file.add(Exit);
		
		
		this.gridFrame.setJMenuBar(menuBar);
	}

	public void start() {
		gridFrame.requestFocus();
		new Thread(this).start();
	}

	
	private void render() {
		// Buffer Strategy
		BufferStrategy bs = this.display.getBufferStrategy();
		if (bs == null) {
			this.display.createBufferStrategy(2);
			this.display.requestFocus();
			return;
		}

		Graphics g = bs.getDrawGraphics();

		// Clear the graphics
		g.clearRect(0, 0, width, height);

		// Draw the display
		g.setColor(Color.black);
		g.fillRect(0, 0, width, height);
		this.display.render(g);

		g.dispose();
		bs.show();
	}
	
	
	
	// FPS should happen as fast as it can, since it renders (only important if
	// the field of vision can change)
	public int FPS = 0;
	
	public void run() {
		int fps = 0;

		double fpsTimer = System.currentTimeMillis();

		while (MainController.running) {

			// This is NOT to sleep, but to limit the game loop
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			render();
			fps++;

			// If the current time is 1 second greater than the last time we
			// printed
			if (System.currentTimeMillis() - fpsTimer >= 1000) {
				if(Settings.DEBUG) System.out.printf("FPS: %d", fps);
				FPS = fps;
				fps = 0;
				fpsTimer += 1000;
			}
		}
		
		// When the gameloop is finished running, close the program
		this.gridFrame.dispatchEvent(new WindowEvent(this.gridFrame, WindowEvent.WINDOW_CLOSING));

	}
}
