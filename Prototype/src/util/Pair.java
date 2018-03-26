package util;

public class Pair {
	private int first;
	private int second;
	 
	public Pair() {
		first=0;
		second=0;
	}
	public Pair(int first, int second) {
		this.first = first;
	    this.second = second;
	} 

	public int getFirst() { return first; }
	public int getSecond() { return second; }

	public Pair set(int first, int second) {
		this.first = first;
		this.second = second;
		return this;
	}
}
