package aa;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num,par = 0 ,impar = 0;
		for(int i =0 ; i< 10; i++) {
			System.out.println("Digite o numero:");
			num = input.nextInt();
			if(num%2 == 0) {
				par++;
			}else {
				impar++;
			}
		
		}
		System.out.print(par+" numero(s) par(es) e "+impar+" numero(s) impar(es)");

	}

}
