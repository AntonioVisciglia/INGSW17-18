package _gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	public MyFrame() throws CloneNotSupportedException {
		init();
	}

	private void init() throws CloneNotSupportedException{

        add(new MyPanel());

        setResizable(false);
        pack();
        setTitle("                                                                                                                    Prototype");    
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	public static void main(String[] args) {
		
		 EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {

				JFrame ex = null;
				try {
					ex = new MyFrame();
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ex.setVisible(true);

			}
		});

	}

}
