package xxx;

public class TestNineNine {
	public void main(String[] args) {
		int i;
		int j = 1;
		for (i = 1; i <= 9; i++) {
			while (j <= 9)
				;
			System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println(); // 換行

		}
	}

	public void main1(String[] args) {
		int i;
		int j = 1;
		for (i = 1; i <= 9; i++) {
			do {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				System.out.println();
			} while (j <= 9);

		}
	}

	public void main2(String[] args) {
		int i = 1, j = 1;
		while (i <= 9)
			;
		do {
			System.out.print(i + "*" + j + "=" + i * j + "\t");
			System.out.println();
		} while (j <= 9);
	}
}