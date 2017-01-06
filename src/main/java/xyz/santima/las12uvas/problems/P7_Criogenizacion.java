package xyz.santima.las12uvas.problems;

import java.util.Scanner;

public class P7_Criogenizacion {

	private static Scanner input;

	public static void main(String[] args) throws Exception {
		P7_Criogenizacion.resolve();
	}

	public static void resolve() throws Exception{

		input = new Scanner(System.in);
		int size = input.nextInt();

		long max, min;
		int times_max, times_min;

		for(int i = 0; i < size; i++){
			
			max = Long.MIN_VALUE;
			times_max = 0;
			min = Long.MAX_VALUE;
			times_min = 0;

			while(input.hasNextLong()){

				long value = input.nextLong();
				if(value == 0){
					break;
				}
				else{
					if(value == max){
						times_max++;
					}
					if(value == min){
						times_min++;
					}
					if(value < min){
						min = value;
						times_min = 1;
					}
					if(value > max){
						max = value;
						times_max = 1;
					}
				}

			}
			
			System.out.println(min + " " + times_min + " " + max + " " + times_max);

		}

	}

}
