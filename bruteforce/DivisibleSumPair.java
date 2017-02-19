import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DivisibleSumPair {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int count = 0;
		for (int a_i = 0; a_i < n; a_i++) {

			for (int b_i = a_i + 1; b_i < n; b_i++) {

				int sum = a[a_i] + a[b_i];

				if (sum % k == 0) {

					count++;
				}

			}
		}

		System.out.println(count);
	}

}
