package xxx;

public class Test4Numbers {
	public static void main(String[] args) { 
		int sum = 4;
		for (int count = 0 ; count <= 100 ; count++) {
			if(count % sum ==0)
				System.out.println(count);
	}
		for (int count = 0 ; count <= 100 ; count += 4) {
			System.out.println(count);
	}
}
}
