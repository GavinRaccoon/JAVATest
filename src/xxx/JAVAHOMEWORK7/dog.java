package xxx.JAVAHOMEWORK7;

import java.io.Serializable;

public class dog implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;

	public dog(String name) {
		this.name = name;
	}

	public void speak() {
		System.out.println("This is dog " + name + " speaking.");
	}
}