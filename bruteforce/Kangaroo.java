
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();

		if(v1 <= v2){
			System.out.println("NO");
			return;
		}
		
		int diff_velocity = v1 - v2;
		int diff_position = x2 - x1;
		
		if(diff_position % diff_velocity == 0){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
