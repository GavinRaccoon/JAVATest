package xxx;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal james = new Animal(2,5.0f);
		james.speak();
		
		System.out.println("====== 過了三年");
		
		
		james.setAge(5);
		james.setWeight(25.0f);
		
		james.speak();
	}

}
