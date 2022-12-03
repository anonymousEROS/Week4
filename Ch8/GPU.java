//Project name: GPU java
//Auhtor: J.Dovala
//Date:13/07/21
//Class:CSC110
//Description: GPU class





package Ch8;

public class GPU extends CPU{
	private int Vram;
	
	public GPU(String comp, String series, int cores, double value, int mem ) {
		super(comp,series,cores,value);
		this.Vram = mem;
	}
	public int getVram() {
		return Vram;
	}
	public void setVram(int mem) {
		Vram = mem;
	}
	public String toString() {
		String str = super.toString();
		str = str + "\tVram: " + getVram();
		return str;
	}
}
