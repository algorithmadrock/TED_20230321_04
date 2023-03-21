/*
RESUMO      : Exercício 04, Implementação de quick sort; algoritmo de ordenação
PROGRAMADORA: Luiza Felix
DATA        : 21/03/2023
 */

package controller;

import br.edu.fateczl.ordenacao.Sorts;

public class Controller {
	public void Quick(int[] vetor, int tamanho) {
		Sorts sorts = new Sorts();
		
		int[] quick = sorts.Quick(vetor);
		for (int i = 0; i < tamanho; i++) {
			System.out.print(quick[i] + " ");
		}
			
	}

}
