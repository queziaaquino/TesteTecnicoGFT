package exercicio4;

import java.util.Scanner;

public class Omaior {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		
        int maiorAB = (a+b+Math.abs(a-b))/2;

        

        int maiorABC = (maiorAB+c+Math.abs(maiorAB-c))/2;


		System.out.println(maiorABC + " eh o maior");
		entrada.close();
	}

		
	
	


}
