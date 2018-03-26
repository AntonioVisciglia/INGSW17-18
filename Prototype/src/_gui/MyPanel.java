package _gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.management.timer.Timer;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

import prototype.*;
import util.Menager;
import util.ImageLoader;
import util.Pair;

// da completare aggiungere il ricordarsi di com'era prima il pentagramma
public class MyPanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;

	final int B_WIDTH = 920;
	final int B_HEIGHT = 720;
	int x = 20;
	int y = 280;
	HashMap<Pair, Image> renderMap;
	Image penta;
	boolean flag = false;
	JButton buttonMinima, buttonSemiMinima, buttonSemiBreve, reset;
	Menager manager;
	OptionPane op;
	Note note;

	public MyPanel() throws CloneNotSupportedException {
		init();
	}

	private void init() throws CloneNotSupportedException {
		manager = new Menager();
		renderMap = new HashMap<>();
		penta = ImageLoader.getInstance().getPentagramma();
	
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);
		buttonMinima = new JButton("Button Minima");
		buttonSemiMinima = new JButton("Button Semi Minima");
		buttonSemiBreve = new JButton("Button Semi Breve");
		reset = new JButton("Reset Editor");

		buttonMinima.addActionListener(this);
		buttonSemiMinima.addActionListener(this);
		buttonSemiBreve.addActionListener(this);
		reset.addActionListener(this);
		reset.setEnabled(true);

		add(buttonMinima);
		add(buttonSemiMinima);
		add(buttonSemiBreve);
		add(reset);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(penta, 10,250,this);
		g.drawImage(penta, 10, 350, this);
		g.drawImage(penta, 10, 450, this);
		g.drawImage(penta, 10, 550, this);

		if( renderMap.isEmpty() ) reset.setEnabled(false);
		else reset.setEnabled(true);

		if ( y >= 680) {
			buttonMinima.setEnabled(false);
			buttonSemiMinima.setEnabled(false);
			buttonSemiBreve.setEnabled(false);
			reset.setEnabled(false);
			new OptionPane(this);
		}

		if( flag ) {
			x+=60;
			if( x >= 890 && y <= 580) {
				y+=100;
				x=80;
			}
			//note.drawNote(g, x, y);
			for( Pair im : renderMap.keySet() ) {
				g.drawImage(renderMap.get(im), im.getFirst(), im.getSecond(), this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if( renderMap.isEmpty() ) x+=60;

			if( e.getSource().equals(buttonMinima ) && y <= 580 ) {
				flag = true;
				note = manager.getNoteMinima();
				renderMap.put(new Pair(x,y), ImageLoader.getInstance().getMinima());
			}
			else if( e.getSource().equals(buttonSemiMinima) && y <= 580 ) {
				flag = true;
				note = manager.getNoteSemiMinima();
				renderMap.put(new Pair(x,y), ImageLoader.getInstance().getSemiMinima());
			}
			else if( e.getSource().equals(buttonSemiBreve) && y <= 580 ) {
				flag = true;
				note = manager.getNoteSemiBreve();
				renderMap.put(new Pair(x,y), ImageLoader.getInstance().getSemiBreve());
			}
			else if( e.getSource().equals(reset) ) {
				this.resetEditor();
			}

			repaint();
		} catch (CloneNotSupportedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public void resetEditor() {
		buttonMinima.setEnabled(true);
		buttonSemiMinima.setEnabled(true);
		buttonSemiBreve.setEnabled(true);
		reset.setEnabled(true);
		x = 20;
		y = 280;
		flag = false;
		renderMap.clear();
	}
}
