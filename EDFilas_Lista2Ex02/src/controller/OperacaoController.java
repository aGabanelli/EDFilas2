package controller;

import fatec.sp.gov.lib.filas.FilaGenerica;
import model.Cliente;

public class OperacaoController {
	
	public void caixa(FilaGenerica<Cliente> fila) {
		
		while(!fila.isEmpty()) {
			try {
				Cliente cliente = fila.remove();
				float valor = cliente.getQtdPecas() * cliente.getValorPecas();
				String valorFormatado = String.format("%.2f", valor);

				System.out.println(cliente.getNome() + " | Valor total: R$" + valorFormatado);
			} catch (Exception e) {
				System.out.println("Fila Vazia");
			}
		}
	}

}
