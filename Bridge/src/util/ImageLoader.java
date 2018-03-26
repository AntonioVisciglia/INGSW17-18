package util;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ImageLoader {

	private static ImageLoader instance;
	private Image ironBookCase, woodBookCase, ironWardrobe, woodWardrobe;

	private ImageLoader() {
		ironBookCase = new ImageIcon("images/libreriaFerro.png").getImage();
		ironWardrobe = new ImageIcon("images/armadioFerro.png").getImage();
		woodBookCase = new ImageIcon("images/libreriaLegno.png").getImage();
		woodWardrobe = new ImageIcon("images/armadioLegno.png").getImage();
	}

	public static ImageLoader getInstance() {
		if( instance == null )
			instance = new ImageLoader();

		return instance;
	}

	public Image getImage(String imageS){
		if( imageS.equals("ironBook") )
			return ironBookCase;
		else if( imageS.equals("woodBook") )
			return woodBookCase;
		else if( imageS.equals("ironWardrobe") )
			return ironWardrobe;
		else if( imageS.equals("woodWardrobe") )
			return woodWardrobe;

		return null;
	}
}
