package xxx;

public class student {
	int score = 90;
	
	public void play(int hours) {
		score -= hours;
	}
	public void study(int hours) {
		score += hours;
	}
	public static void main(String[] args) {
		student david = new student();
		student james = new student();
		
		System.out.println(david.score);
		System.out.println(james.score);
		
		david.play(2);
		david.study(6);
		
		james.play(5);
		james.study(2);
		
		
		System.out.println("================");
		System.out.println(david.score);
		System.out.println(james.score);
	}
}
;
