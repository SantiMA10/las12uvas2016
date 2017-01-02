package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2_ContandoEnLaArena {


	public static void main(String[] args) throws Exception {
		P2_ContandoEnLaArena.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder solution = new StringBuilder();
		boolean end = false;

		while(!end && br.ready()){
						
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				end = true;
				br.close();
			}
			else{
				
				solution.delete(0, solution.length());

				for(int i = 0; i < n; i++){
					solution.append(1);
				}
				
				System.out.println(solution);

			}
			

		}
		

	}

}
