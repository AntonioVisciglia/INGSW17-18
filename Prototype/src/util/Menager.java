package util;

import prototype.*;

public class Menager {

	 private static Minima minima;
	 private static SemiMinima semiMinima;
	 private static SemiBreve semiBreve;

	static {
		System.out.println("HOLAAAAA");
		minima = new Minima();
		semiMinima = new SemiMinima();
		semiBreve = new SemiBreve();
	}

	public Note getNoteMinima() throws CloneNotSupportedException {
		return minima.clone();
	}

	public Note getNoteSemiMinima() throws CloneNotSupportedException {
		return semiMinima.clone();
	}

	public Note getNoteSemiBreve() throws CloneNotSupportedException {
		return semiBreve.clone();
	}
}
