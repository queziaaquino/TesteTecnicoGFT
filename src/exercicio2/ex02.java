package exercicio2;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.println("Digite o turno em que você trabalha onde:  M - Matutino, V- Vespertino e N- Noturno");
		
		
		String turno = entrada.nextLine();
		
		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		}
		else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde!");
		}
		else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		}else {
			System.out.println("Valor Inválido.");
		}
		
		entrada.close();
	}
}
