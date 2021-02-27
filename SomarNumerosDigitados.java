package jhujuh;

import java.util.Scanner;

public class SomarNumerosDigitados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero, soma = 0;
		do{
			System.out.println("Digite o numero:");
			numero = input.nextInt();
			
			soma+=numero;
		
		}while(numero!=0);
		System.out.print(soma);

	}

}
