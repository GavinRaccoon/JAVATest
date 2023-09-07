package xxx.JAVAHOMEWORK7;
import java.io.Serializable;

public class cat  implements Serializable{
	
	private static final long serialVersionUID = 2L;
	private String name;
	
	public cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is cat " + name + " speaking!");
	}
	
}