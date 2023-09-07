package xxx;

public class studentscoretest {
	
	public static void main(String[] args) {
		studentscore score1 = new studentscore();
		score1.play = 2;
		score1.study = 5;
		
		studentscore score2 = new studentscore();
		score2.play = 1;
		score2.study = 6;
		
		score1.showinfo();
		score2.showinfo();}
}
