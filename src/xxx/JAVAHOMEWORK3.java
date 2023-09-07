package xxx;

import java.util.Arrays;
import java.util.Scanner;

public class JAVAHOMEWORK3 {
	public static void main(String[] args) {
//		• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入三角形的三個邊長: ");

		int[] num = { input.nextInt(), input.nextInt(), input.nextInt() };
		Arrays.sort(num);

		int a = (int) (Math.pow(num[0], 2));
		int b = (int) (Math.pow(num[1], 2));
		int c = (int) (Math.pow(num[2], 2));

		if (num[0] + num[1] <= num[2]) {
			System.out.println("這不是三角形");
		} else if ((a + b) == c) {
			System.out.println("直角三角形");
		} else if (num[0] == num[1] && num[2] == num[3]) {
			System.out.println("正三角形");
		} else if (num[0] == num[1] || num[1] == num[2] || num[2] == num[0]) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
//		input.close();

//		• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：
		int t = (int) (Math.random() * 10);
		System.out.println("開始猜數字吧!");
		Scanner number = new Scanner(System.in);

		while (true) {
			int guess = number.nextInt();
			if (guess == t) {
				System.out.println("恭喜答案正確!" + "答案是" + guess);
				break;
			} else if (guess != t) {
				System.out.println("猜錯囉 請繼續猜吧");
			}

		}

//		• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數
		Scanner garbagenum = new Scanner(System.in);
		System.out.println("請輸入不要的數字 : ");

		int j = garbagenum.nextInt();
		int sum = 0;
		for (int i = 1; i <= 49; i++) {
			if (i % 10 != j && i / 10 != j) {
				System.out.println(i);
				sum++;
			}

		}
		System.out.println("總數為 :" + sum + "個");

	}

}
