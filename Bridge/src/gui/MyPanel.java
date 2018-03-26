package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import abstraction.BookCase;
import abstraction.Furniture;
import abstraction.Wardrobe;
import implementor.Iron;
import implementor.Wood;

public class MyPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;

	final int B_WIDTH = 920;
	final int B_HEIGHT = 720;
	Furniture furniture;
	String stringa;
	
	boolean flag = false;
	JPanel panel,panel2, panel3;
	JButton buttonBookCase, buttonWardrobe, 
		buttonBookCaseIron, buttonBookCaseWood, 
		buttonWardrobeIron, buttonWardrobeWood, mainMenu, mainMenu2;

	public MyPanel() {
		init();
	}

	private void init() {
		stringa = "";
		panel = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		buttonBookCase = new JButton("Book Case");
		buttonWardrobe = new JButton("Wardrobe");
		mainMenu = new JButton("Main Menu");
		mainMenu2 = new JButton("Main Menu");
		buttonBookCaseIron = new JButton("Book Case Iron");
		buttonBookCaseWood = new JButton("Book Case Wood");
		buttonWardrobeIron = new JButton("Wardrobe Iron");
		buttonWardrobeWood = new JButton("Wardrobe Wood");

		buttonBookCase.addActionListener(this);
		buttonBookCaseIron.addActionListener(this);
		buttonBookCaseWood.addActionListener(this);
		buttonWardrobe.addActionListener(this);
		buttonWardrobeIron.addActionListener(this);
		buttonWardrobeWood.addActionListener(this);
		mainMenu.addActionListener(this);
		mainMenu2.addActionListener(this);

		panel.add(buttonBookCase);
		panel.add(buttonWardrobe);

		
		panel2.add(buttonBookCaseIron);
		panel2.add(buttonBookCaseWood);
		panel2.add(mainMenu);

		panel3.add(buttonWardrobeIron);
		panel3.add(buttonWardrobeWood);
		panel3.add(mainMenu2);

		
		setBackground(Color.white);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);

		panel.setVisible(true);
		panel2.setVisible(false);
		panel3.setVisible(false);
		
		add(panel);
		add(panel2);
		add(panel3);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		if( flag )
			furniture.drawFurniture(g, stringa);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource().equals(buttonBookCase) ) {
			panel.setVisible(false);
			panel2.setVisible(true);
				buttonBookCaseIron.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource().equals(buttonBookCaseIron)) {
							furniture = new BookCase(new Iron());
							stringa = "ironBook";
							flag = true;
							repaint();
						}
					}
				});

				buttonBookCaseWood.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if( e.getSource().equals(buttonBookCaseWood) ) {
							furniture = new BookCase(new Wood());
							stringa = "woodBook";
							flag = true;
							repaint();
						}
					}
				});

				mainMenu.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if( e.getSource().equals(mainMenu) ) {
							stringa = "";
							panel2.setVisible(false);
							panel.setVisible(true);
							repaint();
						}
					}
				});
				
		}
		else if( e.getSource().equals(buttonWardrobe) ) {
			panel.setVisible(false);
			panel3.setVisible(true);
				buttonWardrobeIron.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if(e.getSource().equals(buttonWardrobeIron)) {
							furniture = new Wardrobe(new Iron());
							stringa = "ironWardrobe";
							flag = true;
							repaint();
						}
					}
				});

				buttonWardrobeWood.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if( e.getSource().equals(buttonWardrobeWood) ) {
							furniture = new Wardrobe(new Wood());
							stringa = "woodWardrobe";
							flag = true;
							repaint();
						}
					}
				});

				mainMenu2.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						if( e.getSource().equals(mainMenu2) ) {
							panel3.setVisible(false);
							panel.setVisible(true);
							repaint();
						}
					}
				});
		}
	}
}
