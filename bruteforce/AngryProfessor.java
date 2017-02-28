import java.util.Scanner;

public class AngryProfessor {

	
	public static void main(String[] args) {
		
		
		 Scanner in = new Scanner(System.in);
	     int t = in.nextInt();
	     
	     for(int i  = 0 ; i < t ; i++){
	    	 
	    	 int n = in.nextInt();
	    	 int k = in.nextInt();
	    	 
	    	 int count = 0;
	    	 for( int i_n = 0 ; i_n < n ; i_n++){
	    		 
	    		 int arrival = in.nextInt();
	    		 
	    		 if(arrival <= 0){
	    			 count++;
	    		 }
	    		 
	    	 }
	    	 
	    	 if(count>=k){
	    		 System.out.println("NO");
	    	 }else{
	    		 System.out.println("YES");
	    	 }
	     }
	}
} 
