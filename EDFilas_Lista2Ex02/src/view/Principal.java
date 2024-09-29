package view;

import model.Cliente;
import controller.OperacaoController;
import fatec.sp.gov.lib.filas.FilaGenerica;


public class Principal {

	public static void main(String[] args) {
		
		FilaGenerica<Cliente> f = new FilaGenerica<>();
		OperacaoController opCont = new OperacaoController();
		
		for(int i = 0; i < 20; i++) {
			Cliente cliente = new Cliente("Cliente" + (i+1) , (int)((Math.random() * 51) + 20), (float)(Math.random() * 101) + 5);
			f.insert(cliente);
		}
		
		opCont.caixa(f);
		
	}

}
