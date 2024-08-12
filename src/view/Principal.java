package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		
		OperacoesController oc = new OperacoesController ();
		oc.cont1000Posicoes(0);
		oc.cont10000Posicoes(0);
		oc.cont100000Posicoes(0);	
	}

}
