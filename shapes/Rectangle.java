package shapes;

public class Rectangle {
	private int height;
	private int width;
	
	public Rectangle(int x, int y) {
		this.width = x;
		this.height = y;
	}
	
	public int getArea() {
		return height*width;
	}
}
