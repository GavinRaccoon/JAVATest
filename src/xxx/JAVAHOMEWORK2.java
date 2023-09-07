package xxx;

public class JAVAHOMEWORK2 {
	public static void main(String[] args) {

		int sum = 0;
		// 要迭代的初始值 ; 可以繼續迭代的條件 ; 每次迭代完要做的事
		for (int count = 2; count <= 1000; count += 2) {

			sum += count;
		}
		System.out.println("從一到一千的偶數和:" + sum);

		int sum1 = 1;
		for (int count2 = 1; count2 <= 10; count2++) {

			sum1 *= count2;
		}
		System.out.println("從一到十的積是: " + sum1);

		int sum3 = 1;
		int count3 = 1;
		while (count3 <= 10) {
			sum3 *= count3;
			count3++;
		}
		System.out.println("從一到十的積是: " + sum3);

		for (int i = 1; i <= 10; i++) {
			int square = i * i;
			System.out.println(square);

		}

		int sum4 = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != 4 && i / 10 != 4) {
				System.out.println(i);
				sum4++;
			}
		}
		System.out.println("總共有" + sum4 + "個");

		for (int i = 0; i < 10; i++) {
			for (int j = 1; j <= 10 - i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
		
		for (char i = 'A'; i <= 'F'; i++ ) {
			for (char j = 'A'; j <= i; j++) {
				System.out.print(i);
		}
			System.out.println();
	}

	}
}
