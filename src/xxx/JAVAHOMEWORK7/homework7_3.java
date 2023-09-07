package xxx.JAVAHOMEWORK7;
import java.io.*;

public class homework7_3 {
	public static void main(String[] args) {
		String sourceFilePath = "source.txt"; 
		String destinationFilePath = "destination.txt"; 

		try {
			copyFile(sourceFilePath, destinationFilePath);
			System.out.println("複製成功");
		} catch (IOException e) {
			System.err.println("複製失敗：" + e.getMessage());
		}
	}

	public static void copyFile(String sourceFilePath, String destinationFilePath) throws IOException {
		File sourceFile = new File(sourceFilePath);
		File destinationFile = new File(destinationFilePath);

		if (!sourceFile.exists()) {
			throw new FileNotFoundException("文件不存在");
		}

		try (FileInputStream inputStream = new FileInputStream(sourceFile);
				FileOutputStream outputStream = new FileOutputStream(destinationFile)) {
			byte[] buffer = new byte[1024];
			int bytesRead;

			while ((bytesRead = inputStream.read(buffer)) > 0) {
				outputStream.write(buffer, 0, bytesRead);
			}
		}
	}
}
