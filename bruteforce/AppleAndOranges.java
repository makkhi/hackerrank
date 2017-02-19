import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleAndOranges {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        
        int appleCnt = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            
            if(apple[apple_i] > 0){
            	int co =  a + apple[apple_i] ;
            	if(co >= s && co <=t){
            		appleCnt++;
            	}
            }
        }
        
        int orangeCnt = 0;
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            
            if(orange[orange_i] < 0) {
            	int co = b + orange[orange_i];
            	
            	if(co >= s && co <= t){
            		orangeCnt++;
            	}
            }
        }
       
        System.out.println(appleCnt);
        System.out.println(orangeCnt);
        
       
    }

}
