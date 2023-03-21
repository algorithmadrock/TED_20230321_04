/*
RESUMO      : Exercício 04, Implementação de quick sort; algoritmo de ordenação
PROGRAMADORA: Luiza Felix
DATA        : 21/03/2023
 */

package view;

import controller.Controller;

public class Principal {
	public Principal() {
		super();
	}
	public static void main(String[] args) {
		Controller controller = new Controller();
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		
		controller.Quick(vetor, vetor.length-1);
		
	}
	}

