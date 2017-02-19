import java.util.Scanner;
public class BetweenTwoSets {

	
	public static void main(String[] args) {
		
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	    
	        
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	           
	        }
	        int[] b = new int[m];
	        for(int b_i=0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	        }
	        
	        int min_in_b = b[0];
	        
	        for( int b_i = 1 ; b_i < m ; b_i++){
	        	
	        	if(b[b_i] < min_in_b){
	        		min_in_b = b[b_i];
	        	}
	        }
	        
	      /*  for(int b_i=0; b_i < m; b_i++){
	           if(b[b_i] % min_in_b != 0){
	        	   System.out.println("0");
	        	   return;
	           }
	        }*/
	        
	        int max_in_a = a[0];
	        
	        
	        for(int a_i=1; a_i < n; a_i++){
	            if(a[a_i] > max_in_a){
	            	max_in_a = a[a_i];
	            	
	            }
	        }
	        
	        
	        int total = 0;
	        
	        for(int k = max_in_a, i = 1 ; k <= min_in_b ; k = max_in_a * ++i){
	        	
	        	boolean a_pass = false;
	        	boolean b_pass = false;
	        	
	        	 for(int a_i=0; a_i < n; a_i++){
	        		 
	        		 if(k % a[a_i] == 0){
	        			 a_pass =  true;
	           		 }else{
	           			 a_pass = false;
	           			 break;
	           		 }
	        	 }
	        		 
	        	 if(a_pass){
	        		 for(int b_i=0; b_i < m; b_i++){
		        		 
	        			 if( b[b_i] % k == 0){
	        				 b_pass = true;
	        			 }else{
	        				 b_pass = false;
	        				 break;
	        			 }
		        	 }
	        	 }
	        	 
	        	 if(a_pass && b_pass){
	        		 total++;
	        	 }
	        	 
	        	 
	        }
	        
	        System.out.println(total);
	        
	        
	        
	}
}
