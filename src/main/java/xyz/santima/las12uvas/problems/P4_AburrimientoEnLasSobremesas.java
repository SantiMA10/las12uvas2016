package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P4_AburrimientoEnLasSobremesas {


	public static void main(String[] args) throws Exception {
		P4_AburrimientoEnLasSobremesas.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean end = false;

		while(!end){
						
			int n = Integer.parseInt(br.readLine());

			if(n == 0){
				end = true;
			}
			else{
				int tri = 0;
				for(int i = 1; i <= n; i++){
					tri += i;
				}
				System.out.println(tri*3);

			}
			

		}
		

	}

}
