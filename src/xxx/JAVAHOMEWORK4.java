package xxx;

public class JAVAHOMEWORK4 {
	public static void main(String[] args) {
		int x[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int i = 0; i < x.length; i++)
			sum += x[i];
		{
			System.out.println((sum / x.length));
		}
		for (int i = 0; i < x.length; i++) {

			if (x[i] > (sum / x.length))
				System.out.println(x[i]);
		}

	}

}
