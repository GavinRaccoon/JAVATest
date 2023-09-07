package xxx;

public class TestBMI {
	public static void main(String[] args) {
		
		//step 1 :建立身高/體重資料
		 
		double height = 1.74 , weight = 56;
		
		//step 2 :算出BMI並顯示出來
		
		double mybmi = weight/(height*height); 
		//double mybmi = weight / Math.pow(height, 2) 次方套件
		System.out.println("BMI是 : " + mybmi);
		System.out.printf("BMI是 : %.2f", mybmi);
		//System.out.printf("BMI是 : %.2f%n", mybmi); %n 換行
		//format(格式)
		
		//step 3 :顯示結果	
			
		if(mybmi >= 24) {
			System.out.println("\n過胖");		
		}
		else if (mybmi < 18.5) {
			System.out.println("\n過瘦");
		}
		else {
			System.out.println("\n正常"); 
		//println  (ln=line 換行)
		
	    }
	}
}
