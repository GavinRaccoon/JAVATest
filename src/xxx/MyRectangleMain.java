package xxx;

public class MyRectangleMain {
	public static void main(String[] args) {
		MyRectangle s1 = new MyRectangle();
		MyRectangle s2 = new MyRectangle(10, 20);
		s1.setWidth(10);
		s1.setDepth(20);
		System.out.println(s1.getArea());
		System.out.println(s2.getArea());
	}
}