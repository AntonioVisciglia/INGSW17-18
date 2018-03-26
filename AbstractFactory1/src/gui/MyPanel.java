package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import abstract_factory.*;
import interface_.Costructor;
import interface_.Factory;
import interface_.Product;

public class MyPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	final int B_WIDTH = 920;
	final int B_HEIGHT = 720;

	JPanel panel = new JPanel();
	JPanel panelB = new JPanel();
	JPanel panelD = new JPanel();

	Costructor costructor;
	Factory factory;
	MyFrame frame;
	JButton animal, human;
	boolean flag = false;

	public MyPanel(MyFrame frame) {
		init(frame);
	}

	protected void init(MyFrame frame) {
		setBackground(Color.white);
		setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
		setDoubleBuffered(true);

		new ChoseFamilu();
		costructor = new Costructor();

		panel.setPreferredSize(new Dimension(200, 200));
		animal = new JButton("Button Animal");
		human = new JButton("Button Human");
		
		JButton dog_butter_Peacock = new JButton("Dog_Butter_Peacock");
		JButton koala_bradipo_pantera = new JButton("Koala_Bradipo_Pantera");
		JButton change = new JButton("Change Family");
		
		JButton human_computer_science = new JButton("human_computer_science");
		JButton human_matemathics = new JButton("human_matemathics");

		animal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if( e.getSource().equals(animal) ){
					factory = new Factory();
					flag = true;

					panel.setVisible(false);
					panelB.setVisible(true);
					panelB.setPreferredSize(new Dimension(200,200));

					dog_butter_Peacock.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if( e.getSource().equals(dog_butter_Peacock) ){
								factory = new FactoryProductDog_Butter_Peacock();
								flag = true;
								repaint();							
							}
						}
					});

					koala_bradipo_pantera.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if( e.getSource().equals(koala_bradipo_pantera) ){
								factory = new FactoryProductKoala_Bradipo_Pantera();
								flag = true;
								repaint();								
							}
						}
					});

					change.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if( e.getSource().equals(change) ){
								panelB.setVisible(false);
								panel.setVisible(true);
								repaint();
							}
						}
					});

					panelB.add(dog_butter_Peacock);
					panelB.add(koala_bradipo_pantera);
					panelB.add(change);
					frame.add(panelB, BorderLayout.SOUTH);
					repaint();
				}
			}
		});

		human.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if( e.getSource().equals(human) ){
					factory = new FactoryProductHuman();
					flag = true;

					panel.setVisible(false);
					panelD.setVisible(true);
					panelD.setPreferredSize(new Dimension(200,200));

					human_computer_science.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if( e.getSource().equals(human_computer_science) ){
								factory = new FactoryProductHumanComputerScience();
								flag = true;
								repaint();								
							}
						}
					});

					human_matemathics.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if( e.getSource().equals(human_matemathics) ){
								factory = new FactoryProductHumanMathematics();
								flag = true;
								repaint();								
							}
						}
					});

					change.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							if( e.getSource().equals(change) ){
								panelD.setVisible(false);
								panel.setVisible(true);
								repaint();
							}
						}
					});
					
					panelD.add(human_computer_science);
					panelD.add(human_matemathics);
					panelD.add(change);
					frame.add(panelD, BorderLayout.SOUTH);
					repaint();
				}
			}
		});

		panel.add(animal);
		panel.add(human);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);

	}

	@Override
	protected void paintComponent(Graphics g) {
		if( flag ){
			super.paintComponent(g);
			costructor.DrawComponent(factory, g, this);
		}
	}
}