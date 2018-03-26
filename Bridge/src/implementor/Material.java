package implementor;

import java.awt.Graphics;
import util.ImageLoader;

public interface Material {
	Material getMaterial();

	public static void draw(Graphics g, String s) {
		g.drawImage(ImageLoader.getInstance().getImage(s), 350, 200, null);
	}
}
