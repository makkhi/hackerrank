import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CircularArrayRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        
 
        if((n % k != 0 || k == 1) && n > 1 && k > 0){
        	
        	if(n > k && n / 2 < k){
        		// left rotation
        		int left = n - k;
        		
        		for(int i = 0 ; i < left ; i++){
        			
        			int leftMost = a[0];
        			
        			for(int j = 1 ; j < n ; j++){
        				a[j-1] = a[j];
        			}
        			a[n-1] = leftMost;
        		}
        		
        	}else{
        		// right rotation
        		for( int i = 0 ; i < k ; i++){
        			
        			int rightMost = a[n-1];
        			
        			for(int j = n - 2 ; j >=0 ; j--){
        				a[j+1] = a[j];
        			}
        			
        			a[0] = rightMost; 
        		}
        			
        	}
        }
        
        
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
        }
    }
}

