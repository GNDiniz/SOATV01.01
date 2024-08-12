package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	public void cont1000Posicoes(int posicoes) {
		//Preenche o vetor de mil posições com o valor zero.
		int[] vetor = new int [1000];
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 1000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS - 10^-9 s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo total para 1000 posições: "+tempoTotal+" s. ");
	}
	public void cont10000Posicoes(int posicoes) {
		//Preenche o vetor de 10 mil posições com o valor zero.
		int[] vetor = new int [10000];
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS - 10^-9 s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo total para 10000 posições: "+tempoTotal+" s. ");
	}
	public void cont100000Posicoes(int posicoes) {
		//Preenche o vetor de 100 mil posições com o valor zero.
		int[] vetor = new int [100000];
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			vetor[i] = 0;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		//tempoTotal nS - 10^-9 s
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("Tempo total para 100000 posições: "+tempoTotal+" s. ");
	}
}
