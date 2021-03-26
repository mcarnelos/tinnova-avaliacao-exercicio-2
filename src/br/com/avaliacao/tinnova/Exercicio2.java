package br.com.avaliacao.tinnova;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
		int var = 0;
		
		System.out.print("Vetor inicial: ");
		
		for(int i = 0; i < 8; i++) {
			System.out.print(" " + v[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 7; j++) {
				if(v[j] > v[j + 1]) {
					var = v[j];
					v[j] = v[j+1];
					v[j+1] = var;
				}
			}
		}
		
		System.out.print("Vetor ordenado:");
		for(int i = 0; i < 8; i++){
			System.out.print(" "+v[i]);
		}
	}

}
