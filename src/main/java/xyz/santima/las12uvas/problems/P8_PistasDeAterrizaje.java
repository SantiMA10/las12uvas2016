package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P8_PistasDeAterrizaje {


	public static void main(String[] args) throws Exception {
		P8_PistasDeAterrizaje.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    while(br.ready()){
	    	
	    	String input = br.readLine();
	    	int runway = Integer.parseInt(input.substring(0, 2));
	    	String side = input.substring(2);
	    	
	    	if(runway > 18){
	    		runway -= 18;
	    	}
	    	else{
	    		runway += 18;
	    	}
	    	
	    	if(side.contains("L")) side = "R";
	    	else if(side.contains("R")) side = "L";
	    	
	    	System.out.println(String.format("%02d", runway) + side);
	    	
	    }
		

	}

}
