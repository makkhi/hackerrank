import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		long min = Long.MIN_VALUE;
		long max = Long.MAX_VALUE;
		long sum = 0;
		
        long a = in.nextLong();
        
        min = a;
        max = a;
        
        sum = a;
        
        long b = in.nextLong();
        
        if(b < min){
        	min = b;
        }
        
        if( b > max){
        	max = b;
        }
        sum = sum + b;
        
        long c = in.nextLong();
        if(c < min){
        	min = c;
        }
        
        if( c > max){
        	max = c;
        }
        sum = sum + c;
        
        long d = in.nextLong();
        if(d < min){
        	min = d;
        }
        
        if( d > max){
        	max = d;
        }
        sum = sum + d;
        
        long e = in.nextLong();
        
        if(e < min){
        	min = e;
        }
        
        if(e > max){
        	max = e;
        }
        sum = sum + e;
        
        
        System.out.println((sum - max) + " " + (sum - min));
        
	}

}
