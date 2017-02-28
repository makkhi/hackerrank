import java.util.Scanner;

public class ViralAdvertising {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		int total = 2;
		int positive = 2;
		
		for(int j = 2 ; j <= i ; j++){
			
			positive = (positive * 3) / 2;
			total = total + positive;
		
		}
		
		System.out.println(total);
		
	}

}
