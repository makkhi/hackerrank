import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesignerPDF {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        
        int maxHeight = -1;
        for(int i = 0 ; i < word.length() ; i++){
        	int c = word.charAt(i);
        	int index = c - 'a';
        	if(h[index] > maxHeight){
        		maxHeight = h[index];
        	}
        }
        
        System.out.println(maxHeight * word.length());
		
	}

}
