package ddf;

import java.util.Scanner;

public class MediaMultiplos3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numero, media = 0,n=-1;
		do{
			System.out.println("Digite o numero:");
			numero = input.nextInt();
			if(numero%3 ==0) {
				media+=numero;
				n++;
			}
			
		
		}while(numero!=0);
		System.out.print((double)media/n);

	}

}
