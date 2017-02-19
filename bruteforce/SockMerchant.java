
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {
	
	public static void main(String[] args) {
		
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int c[] = new int[n];
	        
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        
	        Map<Integer, Integer> map = new HashMap<>();
	        
	        for(int c_i=0; c_i < n; c_i++){
	        	
	           Integer count = map.get(c[c_i]);
	           
	           if(count == null){
	        	   Integer new_count = 1;
	        	   map.put(c[c_i], new_count);
	           }else{
	        	   
	        	   count = count.intValue() + 1;
	        	   map.put(c[c_i],count);
	        	   
	           }
	           
	           
	        }
	        
	        Iterator<Integer> it = map.keySet().iterator();
	        
	        int count = 0;
	        while(it.hasNext()){
	        	
	        	Integer key = it.next();
	        	
	        	Integer value = map.get(key);
	        	
	        	int cnt = value.intValue() / 2;
	        	
	        	count = count + cnt;
	        	
	        }
	        
	        System.out.println(count);
	        
	}

}
