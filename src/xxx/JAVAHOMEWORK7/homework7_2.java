package xxx.JAVAHOMEWORK7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class homework7_2 {

	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data.txt", true))) {
			Random random = new Random();
			for (int i = 0; i < 10; i++) {
				int randomNumber = random.nextInt(1000) + 1;
				writer.write(Integer.toString(randomNumber));
				writer.newLine();
			}
			System.out.println("加入十個隨機數到 Data.txt 文件。");
		} catch (IOException e) {
			System.err.println("寫入錯誤: " + e.getMessage());
		}
	}
}
