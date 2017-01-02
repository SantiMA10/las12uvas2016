package xyz.santima.las12uvas.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1_CociendoHuevos {

	private static final int MINUTES = 10;

	public static void main(String[] args) throws Exception {
		P1_CociendoHuevos.resolve();
	}

	public static void resolve() throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder solution = new StringBuilder();
		boolean end = false;

		while(!end && br.ready()){

			solution = new StringBuilder();

			String input_aux[] = br.readLine().split(" ");
			double h = Integer.parseInt(input_aux[0]);
			double c = Integer.parseInt(input_aux[1]);

			if(h == 0 && c == 0){
				end = true;
				br.close();
			}
			else{
				if(h <= c){
					solution.append(MINUTES);
				}
				else{
					Double n = Math.ceil(h/c);
					solution.append(MINUTES * n.intValue());
				}

				System.out.println(solution);

			}


		}

	}

}
