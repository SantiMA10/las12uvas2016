package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P6_CubosVisibles {


	public static void main(String[] args) throws Exception {
		P6_CubosVisibles.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
	    
	    for(int i = 0; i < size; i++){
	    	
	    	long n = Long.parseLong(br.readLine());
	    	System.out.println(n*n*n-((n-2)*(n-2)*(n-2)));
	    	
	    }
		

	}

}
