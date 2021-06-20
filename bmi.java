import java.util.Scanner;

public class BMI {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("vazn(kg): ");
		String w = scanner.nextLine(); 
		System.out.print("ghad(m): ");
		String h = scanner.nextLine(); 
		
		int w2 = Integer.valueOf(w) ;
		float h2 = Float.valueOf(h);
		
		float bmi = w2/(h2*h2);
		System.out.println(bmi);
		
		String status = "";
		
		if (bmi < 18.5) {
			status = "kambood vazn";
		}else if (bmi < 24.9) {
			status = "vazn monaseb";
		}else if (bmi < 29.9) {
			status = "ezafe vazn";
		}else {
			status = "chagh";
		}
		
		System.out.println(status);
		
	}

}
