package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//introdução do tamanho da matriz
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite quanto por quanto voce quer sua matriz");
		int num = scanner.nextInt();
		int mat[][]= new int [num*2][num*2];
		int inicio =0;
		int fim = num-1;
		int i=1;
		
		//preenchimento da matriz
		while(i<=num*num) {
			for(int j=inicio; j<=fim;j++) {
				mat[inicio][j]= i++;
			}
		for (int j=inicio+1;j<=fim;j++) {
			mat[j][fim]= i++;
		}
		for(int j=fim-1;j>=inicio;j--) {
			mat[fim][j]=i++;
		}
		for(int j= fim-1; j>=inicio+1;j--){
			mat[j][inicio]=i++;
		}
		inicio++;
		fim--;
		}
		
		//impressao da matriz
		for(i=0;i<num;i++) {
			System.out.println();
			for (int j=0;j<num;j++) {
				System.out.print(mat[i][j] + "\t");
			}
		}
	}
}
