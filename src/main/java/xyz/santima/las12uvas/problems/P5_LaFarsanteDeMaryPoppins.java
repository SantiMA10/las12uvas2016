package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5_LaFarsanteDeMaryPoppins {


	public static void main(String[] args) throws Exception {
		P5_LaFarsanteDeMaryPoppins.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
	    
	    for(int i = 0; i < size; i++){
	    	
	    	String aux = br.readLine();
	    	if(aux.charAt(0) >= 'A' && aux.charAt(0) <= 'Z'){
	    		aux = new StringBuilder(aux).reverse().toString().toLowerCase();
		    	System.out.println(aux.substring(0, 1).toUpperCase() + aux.substring(1));
	    	}
	    	else{
	    		System.out.println(new StringBuilder(aux).reverse().toString());
	    	}
	    	
	    }
		

	}

}
