import java.util.Scanner;

public class BeautifulDaysAtMovie {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long i = sc.nextInt();
		long j = sc.nextInt();
		long k = sc.nextInt();

		long total=0;
		for (long number = i; number <= j; number++) {

			long reversed = reverse(number);
			long diff = Math.abs(reversed - number);
			
			if(diff % k == 0){
				total++;
			}
		}
		
		System.out.println(total);

	}

	public static long reverse(long number) {

		long reversed = 0;
		long i = 0;

		while (number > 0) {
			
			i = number % 10;
			number = number - i;
			number = number / 10;
			reversed = reversed * 10 + i;
		}
		return reversed;

	}
}
