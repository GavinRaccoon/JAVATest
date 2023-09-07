package xxx.JAVAHOMEWORK7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class homework7_1 {
	public static void main(String[] args) {
		String fileName = "Sample.txt";
		int byteCount = 0;
		int charCount = 0;
		int lineCount = 0;

		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader)) {

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				byteCount += line.getBytes().length;
				charCount += line.length();
				lineCount++;
			}

		} catch (IOException e) {
			System.err.println("無法讀取文件: " + e.getMessage());
		}

		System.out.println(fileName + "檔案共有 " + byteCount + " 個位元組, " + charCount + " 個字元, " + lineCount + " 列資料");
	}
}
