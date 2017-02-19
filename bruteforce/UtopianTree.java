import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {
	
	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);
	     int n = in.nextInt();
	     
	     int c[] = new int[n];
	     
	     for(int c_i = 0 ; c_i < n; c_i++){
	    	 
	    	 c[c_i] = in.nextInt();	    	 
	     }
	     
	     for(int c_i = 0 ; c_i < n; c_i++){
	    	 
	    	 System.out.println(count(c[c_i]));	 
	     }
	    	
	}
	
	public static int count(int cycles){
		
		boolean spring = true;
		
		int count = 1;
		for(int i = 1 ; i <= cycles ; i++ ){
			
			if(spring){
				count = count * 2;
				spring = false;
			}else{
				
				count = count + 1;
				spring = true;
			}
			
		}
		
		return count;
		
		
	}

}
