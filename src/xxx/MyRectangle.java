package xxx;

public class MyRectangle {
	public double width;
	public double depth;

	public void setWidth(double width) {
		this.width = width;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getArea() {
		return width * depth;
	}

	public MyRectangle() {

	}

	public MyRectangle(double widthxx, double depthxx) {
		this.width = widthxx;
		this.depth = depthxx;
	}

}