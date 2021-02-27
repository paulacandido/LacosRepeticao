package dds;

import java.util.Scanner;

public class IdadeMenorde25eMaiorde50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int idade = 26, vintao = 0 ,cinquenta = 0;
		while(idade != -99) {
			System.out.println("Digite o numero:");
			idade = input.nextInt();
			if(idade <21 && idade != -99) {
				vintao++;
			}else if (idade > 50) {
				cinquenta++;
			}
		
		}
		System.out.print(vintao+" pessoa(s) com menos de 21 e "+cinquenta+" pessoa(s) com mais de 50");
	}

}
