package xxx.JAVAHOMEWORK6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("x：");
			int x = scanner.nextInt();

			System.out.print("y：");
			int y = scanner.nextInt();

			double result = calculator.powerXY(x, y);
			System.out.println(x + " 的 " + y + " 次方是：" + result);
		} catch (CalException e) {
			System.err.println("例外：" + e.getMessage());
		} catch (java.util.InputMismatchException e) {
			System.err.println("請輸入整數。");
		} finally {
			scanner.close();
		}
	}
}