package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3_La13_14 {


	public static void main(String[] args) throws Exception {
		P3_La13_14.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
	    
	    for(int i = 0; i < size; i++){
	    	
	    	String[] aux = br.readLine().split("-");
	    	int n1 = Integer.parseInt(aux[0]);
	    	int n2 = Integer.parseInt(aux[1]);
	    	
	    	if((n1 % 2 == 0 && n2 % 2 != 0 && n1 < n2 && n1 - n2 == -1) ||
	    			(n2 % 2 == 0 && n1 % 2 != 0 && n2 < n1 && n2 - n1 == -1)){
	    		System.out.println("SI");
	    	}
	    	else{
	    		System.out.println("NO");
	    	}
	    	
	    }
		

	}

}
