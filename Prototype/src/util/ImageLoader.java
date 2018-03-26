package util;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageLoader {
	private static ImageLoader instance;
	Image semiMinima, semiBreve, minima, pentagramma;

	private ImageLoader() {
		semiMinima = new ImageIcon("images/semiminima.png").getImage();
		semiBreve = new ImageIcon("images/semibreve.png").getImage();
		minima = new ImageIcon("images/minima.png").getImage();
		pentagramma = new ImageIcon("images/pentagramma.png").getImage();
	}

	public static ImageLoader getInstance() {
		if( instance == null )
			instance = new ImageLoader();
		return instance;
	}

	public Image getSemiMinima() {
		return semiMinima;
	}

	public Image getSemiBreve() {
		return semiBreve;
	}

	public Image getMinima() {
		return minima;
	}

	public Image getPentagramma() {
		return pentagramma;
	}
	

}
