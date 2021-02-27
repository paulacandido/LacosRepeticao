package ffd;

import java.util.Scanner;

public class PessoasTemperamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int idade, sexo ,temperamento,cal = 0,mulNev=0,homAgr = 0,outCal = 0 ,nevQuar = 0,calDez = 0,pessoa =0;
		while(pessoa < 10) {
			System.out.println("Digite a idade:"+pessoa);
			idade = input.nextInt();
			System.out.println("Digite seu sexo: (1-feminino / 2-masculino / 3-Outros)");
			sexo = input.nextInt();
			System.out.println("Digite seu temperamento: (1 - calmo. /n 2 - nervoso. /n 3 - agressivo.");
			temperamento = input.nextInt();
			switch(sexo) {
			case 1:
				if(temperamento == 2) {
					mulNev++;
				}
			case 2:
				if(temperamento == 3) {
					homAgr++;
				}
			case 3:
				if(temperamento == 1) {
					outCal++;
				}
			}
			if(idade<18 && temperamento == 1) {
				calDez++;
			}
			if(idade>50 && temperamento == 2) {
				nevQuar++;
			}
			if(temperamento == 1) {
				cal++;
			}
			pessoa++;
			
		
		}
		System.out.print("Há "+cal+" pessoas calmas, destas "+calDez+" tem menos de 18, e "+outCal+" declaram seu sexo como outro. "
				+ "\nHá "+homAgr+" homens agressivos."
				+"Há "+nevQuar+" nervosas com mais de quarenta anos e "+mulNev+" mulheres nervosas.");

	}

}
